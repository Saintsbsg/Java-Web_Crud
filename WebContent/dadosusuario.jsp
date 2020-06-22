<%@page import="br.estudo.modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar dados</title>
</head>
<body>
     <h1>Editar dados</h1>
     
     
     <% Usuario usuario =(Usuario)request.getAttribute("UsuarioBD"); %>
     
     <form method="post" action="alterarusuario">
         Id:<input type="text" name="txtid" value="<%= usuario.getId() %>" readonly="readonly"><br><br>
         Nome:<input type="text" name="txtnome" value="<%= usuario.getNome() %>"><br><br>
         Login:<input type="text" name="txtlogin" value="<%= usuario.getLogin()%>"><br><br>
         Senha:<input type="password" name="txtsenha" value="<%= usuario.getSenha() %>"><br><br>
         <input type="submit" value="Alterar Dados">
     </form>

</body>
</html>