package org.example.demo.ticket.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.WebappHelper;

import java.util.List;

public class GestionProjetsAction extends ActionSupport {

    // attributes

    private List<Projet> listProjets;
    private Projet projet;
    private Integer Id;

    // getters and setters

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public List<Projet> getListProjets() {
        return listProjets;
    }

    public Projet getProjet() {
        return projet;
    }

    // methods

    /**
     * Action renvoyant la listes de projets
     * @return SUCCESS
     */
      public String doList(){
          listProjets = WebappHelper.getManagerFactory().getProjetManager().getListProjet();
          return ActionSupport.SUCCESS;
      }

    /**
     * Action affichant les détails d'un projet
     * @return SUCCESS/ERROR
     */
    public  String doDetails(){
        if (Id == null){
            this.addActionError("Vous devez renseigner l'id du projet recherche");
        }else{
            try {
                projet = WebappHelper.getManagerFactory().getProjetManager().getProjet(Id);
            }catch (NotFoundException e){
                this.addActionError("Projet non trouvé");
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }
}
