<%@ page import="mytags.Bean1"%>
<%@ page import="java.util.Collection"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<html >
<head>
<title>
jspJSTL
</title>
</head>
<body bgcolor="#ffffff">
<h1>
JSTL Core
</h1>
<%-- 1) defina uma variável de nome "nome" e com algum valor--%>
<c:set var="nome" value="Carlos"/>
<br>

<%-- 2) imprima a variável criada em 1, na tela--%>
Nome:<c:out value="${nome}"/>
<br><br>

<%-- 3) crie um bean do tipo mytags.Bean1 de scopo page e set sua propriedade nome--%>
<jsp:useBean id="bean" class="mytags.Bean1"/>
<jsp:setProperty name="bean" property="nome" value="xyz"/>

<%-- 4) imprimindo o campo nome do bean usando EL --%>
Valor do campo nome: <c:out value="${bean.nome}" />
<br><br>

<%-- 5) verifique com um if se o bean.nome é nulo, se for, imprima na tela "Nome é Nulo!"--%>
<c:if test="${bean.nome==null}">
   Nome é Nulo
<br><br>
</c:if>

<%-- 6) Usando choose when e otherwise: verifique se o bean.nome é nulo, se for imprima "O campo Nome é Nulo", caso contrário: "O campo Nome não é Nulo."--%>
<c:choose>
<c:when test="${bean.nome == null}">
    O campo Nome é Nulo
</c:when>
<c:otherwise>
    O campo Nome não é Nulo.
</c:otherwise>
</c:choose>

<br><br>
<%-- 7) usando a tag forEach, imprima 11 vezes na tela: "iterando 11 vezes com forEach!" --%>
<c:forEach begin="0" end="10">
    iterando 11 vezes com forEach!<br>
</c:forEach>
<br>

<%-- 8) Imprima todos os valores contidos em bean.colecao, percorrendo uma collection com forEach e mostrando com a tag c:out--%>
<table>
<c:forEach items="${bean.colecao}" var="colecao">
<tr><td>
  <c:out value="${colecao}" />
</td></tr>
</c:forEach>
</table>

<%-- redirecionando para outra página --%>
<%--
<c:redirect url="/JSPTagLibs.jsp"/>
--%>

</body>
</html>
