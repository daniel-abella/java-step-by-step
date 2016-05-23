<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"
           prefix="fmt" %>

<%@ taglib uri="/WEB-INF/functionUtils.tld"
           prefix="utils" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem de Arquivos</title>

<script type="text/javascript">

var diretorio = '${diretorio}';
var extensao = '${extensao}';

function submit2(){

	var nomeArquivo = document.getElementById("arquivo").value;

	var url = '<c:url value="/upload"/>?nomeArquivo='
        +nomeArquivo
        +'&diretorio='+diretorio
        +'&extensao='+extensao;

	//alert(nomeArquivo.toSource());

	document.forms[0].action=url;
	document.forms[0].submit();
}

function deletar(nomeArquivo){

	if(confirm('Tem certeza que deseja remover o arquivo  "'+nomeArquivo+'"')){
		var url = '<c:url value="/remover"/>?nomeArquivo='
	        +encodeURIComponent(nomeArquivo)
	        +'&diretorio='+diretorio
	        +'&extensao='+extensao;

		//alert(nomeArquivo.toSource());

		document.forms[0].action=url;
		document.forms[0].submit();
	}
}
</script>

</head>
<body>
<h1>Listagem de Arquivos</h1>

<form action='<c:url value="/upload"/>'
      enctype="multipart/form-data" method="post">
<input type="hidden" name="nomeArquivo" id="nomeArquivo"/>

<input type="file" name="arquivo" id="arquivo"/>

<input type="button" value="upload" onclick="submit2();"/>
</form>
<br><br>


<c:forEach items="${arquivos}" var="arquivo" >
<a href='<c:url value="/download"><c:param name="path" value="${arquivo.path}"/></c:url>'>
<c:choose>
<c:when test="${arquivo.name eq nomeArquivo}">
<span style="color:red">
${arquivo.name}
</span>
</c:when>
<c:otherwise>
${arquivo.name}
</c:otherwise>
</c:choose>
</a>
 - ${arquivo.length()/1024}Kb
<a href="#" onclick="deletar('${arquivo.name}');"/>Remover</a>
<!-- {utils:dateFromMilliseconds(arquivo.lastModified())}  -->
<br>
</c:forEach>
</body>
</html>