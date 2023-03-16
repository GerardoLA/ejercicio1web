<%@ page import="java.util.ArrayList" %>
<%@ page import= "modelo.Usuario" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) request.getAttribute("usuarios"); %>
<%out.println(listaUsuarios);%>

<%for(Usuario usuario : listaUsuarios) {
out.println(usuario.getId());
out.println(usuario.getNombre());%>
<%} %>


</body>
</html>