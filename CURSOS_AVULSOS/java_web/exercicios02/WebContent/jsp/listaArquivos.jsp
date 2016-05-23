<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem de Arquivos</title>
</head>
<body>
<h1>Listagem de Arquivos</h1>

<c:forEach items="${arquivos}" var="arquivo">
<a href='<c:url value="/download"><c:param name="path" value="${arquivo.path}"/></c:url>'>${arquivo.name}</a><br>
</c:forEach>

</body>
</html>