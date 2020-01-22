package org.example.demo.ticket.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.components.ActionError;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.WebappHelper;

import java.util.List;

public class GestionUtilisateurAction extends ActionSupport {


    /************************ Attributes *********************************/
    private String nom;
    private String prenom;
    private Integer Id;
    private Utilisateur user;
    private List<Utilisateur> listUtilisateur;


    /***************** getters and setters ******************************/

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /*********************** Methodes *********************/

    /**
     * Action affichant un utilisateur
     * @return  SUCCESS/ERROR
     */
    public String getUserDetails(){
        if (Id == null){
            this.addActionError("vous devez donner l'id du projet recherche");
        }else{
            try{
                user = WebappHelper.getManagerFactory().getUtilisateurManager().getUtilisateur(Id);
            }catch(NotFoundException e){
                this.addActionError("utilisateur inexistant");
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Action affichant la listes des utilisateurs
     * @return SUCCESS
     */
    public String getListUsers(){
        listUtilisateur = WebappHelper.getManagerFactory().getUtilisateurManager().getListUtilisateur();
        return ActionSupport.SUCCESS;
    }

}
