<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 22/01/2020
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> Projet <s:property value="projet.nom"></s:property>  </title>
</head>
<body>
    <h2> Projet <s:property value="projet.nom"></s:property>  </h2>

    <ul>

        <li>ID: <s:property value="projet.id"></s:property>  </li>
        <li>Nom: <s:property value="projet.nom"></s:property></li>
        <li>Responsable: <s:a action="detailsUser"> <s:param name="id"  value="user.id"> </s:param> <s:property value="responsable.nom"></s:property> <s:property value="user.prenom"></s:property> </s:a></li>
        <li>Date creation: <s:date name="projet.dateCreation"></s:date> </li>
        <c:out value="${projet.cloture == 'true' ? 'Projet dékà cloturé' :''}"/>

    </ul>
</body>
</html>
