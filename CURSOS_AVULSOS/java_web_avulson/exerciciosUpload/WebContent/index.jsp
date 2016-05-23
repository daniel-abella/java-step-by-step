<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function submit2(){
	document.forms[0].action='<c:url value="/upload"/>?nomeArquivo='+document.getElementById("arquivo").value;;
	document.forms[0].submit();
}
</script>
</head>
<body>
<form action='<c:url value="/upload"/>'
      enctype="multipart/form-data" method="post">
<input type="hidden" name="nomeArquivo" id="nomeArquivo"/>

<input type="file" name="arquivo" id="arquivo"/>

<input type="button" value="upload" onclick="submit2();"/>
</form>
</body>
</html>