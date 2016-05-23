<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resposta JSP</title>
</head>
<body>

<%! int contador = 0; %>

<% contador++; %>

<%!

   private boolean ehPar() {
       boolean par = false;
       if( (contador%2) == 0) {
           par = true;
       }
       return par;
   }

%>

    Valor atual do contador: <%= contador %><br>
    <% if(ehPar()) { %>
       <%@ include file="/par.txt" %>
     <% } else { %>
       <%@ include file="/impar.txt" %>
     <% } %>

</body>
</html>