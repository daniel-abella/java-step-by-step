<%@ page import="mytags.Bean1"%>
<%@ page import="java.util.Collection"%>
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
<%-- 1) defina uma vari�vel de nome "nome" e com algum valor--%>

<br>

<%-- 2) imprima a vari�vel criada em 1, na tela--%>
Nome:
<br><br>

<%-- 3) crie um bean do tipo mytags.Bean1 de escopo page e set sua propriedade nome--%>

<%-- 4) imprima o campo nome do bean usando EL --%>
Valor do campo nome: 
<br><br>

<%-- 5) verifique com um c:if se o bean.nome � nulo, se for, imprima na tela "Nome � Nulo!"--%>


<%-- 6) Usando c:choose, c:when e c:otherwise: verifique se o bean.nome � nulo, se for imprima "O campo Nome � Nulo", caso contr�rio: "O campo Nome n�o � Nulo."--%>

<br><br>

<%-- 7) usando a tag c:forEach, imprima 11 vezes na tela: "iterando 11 vezes com forEach!" --%>

<br>

<%-- 8) Imprima todos os valores contidos em bean.colecao, percorrendo uma collection com c:forEach e mostrando com a tag c:out--%>

<%-- 9) Redirecione para outra p�gina, utilizando a c:redirect --%>


</body>
</html>
