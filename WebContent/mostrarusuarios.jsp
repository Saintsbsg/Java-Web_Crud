<%@page import="br.estudo.modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Usuarios</title>
</head>
<body>
      <h1>Lista de Usuarios</h1>
      
      <a href="Cadastrar_Usuario.html"><button>Cadastrar Novo Usuário</button></a>
      <br><br>
      
      <% List<Usuario> usuarios = (List<Usuario>)request.getAttribute("listaDeUsuarios"); %>
      
      
      <table border ="1" style= width:60%>
           <thead>
                <tr style= "background-color: black; color:white">
                   <th>ID</th>
                   <th>Nome</th>
                   <th>Login</th>
                   <th>Senha</th>
                   <th colspan="2">Ação</th>
                </tr>
           </thead>
           <tbody>
                <%for(Usuario usuario:usuarios){ %>
                <tr>
                   <td><%= usuario.getId() %></td>
                   <td><%= usuario.getNome() %></td>
                   <td><%= usuario.getLogin() %></td>
                   <td><%= usuario.getSenha() %></td>
                   <td><a href="alterarusuario?id=<%= usuario.getId() %>">Alterar</a></td>
                   <td><a href="excluirusuario?id=<%= usuario.getId() %>">Excluir</a></td>
                </tr>
                 <% } %>
           </tbody>
      </table>
      
    

</body>
</html>