<!-- colocar chamada para JSTL Core e Formatting  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/WEB-INF/mytags.tld" prefix="q"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here23</title>
</head>
<body>

<c:set var="a" value="11" scope=""/>

<jsp:useBean id="mensagens" scope="page" class="java.util.ArrayList"></jsp:useBean>
<%
	mensagens.add("Mensagem12");
	mensagens.add("Mensagem22");
	mensagens.add("Mensagem32");
	mensagens.add("Mensagem42");
%>


<!-- Trocar todos os scriptlets deste ponto em diante por tags JSTL -->

<c:if test="${a > 2}">
     a é maior que 2<br>
</c:if>

<c:choose>
	<c:when test="${a==1}">
     a é igual a 1<br>
	</c:when>
	<c:when test="${a==2}">
     a é igual a 2<br>
	</c:when>
	<c:otherwise>
		<c:out value="${a}"></c:out><br>
	</c:otherwise>
</c:choose>

<c:forEach items="${mensagens}" var="msg">
	<c:out value="${msg}"/>
	<q:bem-vindo cpf="${msg}"></q:bem-vindo>
</c:forEach>

</body>
</html>