<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:choose>
	<c:when test="${lista eq true}">
	<c:forEach items="${listagem}" var="pedaco">
	${pedaco}<br>
	</c:forEach>
	</c:when>
	<c:otherwise>
	${mensagemResposta}
	</c:otherwise>
</c:choose>

<c:if test="${lista eq true}">
lista
</c:if>

<c:if test="${lista eq false}">
${mensagemResposta}
</c:if>



</body>
</html>