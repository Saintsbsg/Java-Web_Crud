package br.estudo.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.estudo.dao.UsuarioDao;
import br.estudo.modelo.Usuario;


@WebServlet("/cadastrarusuario")
public class CadastrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chamando o metodo POST");
		
		
		String nome = request.getParameter("txtnome");
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		
		Usuario user1 = new Usuario();
		user1.setNome(nome);
		user1.setLogin(login);
		user1.setSenha(senha);
		
		UsuarioDao userdao = new UsuarioDao();
		userdao.cadastrar(user1);
		
		response.sendRedirect("http://localhost:8180/JavaWeb_Aula/mostrarusuarios");
	}

}
