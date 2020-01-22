<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 22/01/2020
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:property value="user.nom"></s:property><s:property value="user.prenom"></s:property> </title>
</head>
<body>

<ul>
        <li><s:property value="user.id"></s:property> </li>
        <li><s:property value="user.nom"></s:property> </li>
        <li><s:property value="user.prenom"></s:property> </li>

</ul>
</body>
</html>
