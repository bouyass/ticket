<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 22/01/2020
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Liste des projets</title>
</head>
<body>
  <h2>Liste des projets</h2>
  <ul>
<s:iterator value="listProjets">
    <li>
    <s:a action="detailsProjets"> <s:param name="id" value="id"></s:param>  <s:property value="nom"></s:property> </s:a>
    Responsable: <s:a action="detailsUser"> <s:param name="id"  value="responsable.id"> </s:param> <s:property value="responsable.nom"></s:property> <s:property value="responsable.prenom"></s:property> </s:a>
    </li>
</s:iterator>
  </ul>

<s:a href="/ticket/index"> Revenir a l'accueil</s:a>

</body>
</html>
