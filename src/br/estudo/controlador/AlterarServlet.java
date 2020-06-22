package br.estudo.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.estudo.dao.UsuarioDao;
import br.estudo.modelo.Usuario;


@WebServlet("/alterarusuario")
public class AlterarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		UsuarioDao userdao = new UsuarioDao();
		Usuario usuario = userdao.buscarPorId(id);
		
		request.setAttribute("UsuarioBD", usuario);
		request.getRequestDispatcher("dadosusuario.jsp").forward(request, response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("txtid"));
		String nome = request.getParameter("txtnome");
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		
		Usuario user = new Usuario();
		user.setId(id);
		user.setNome(nome);
		user.setLogin(login);
		user.setSenha(senha);
		
		UsuarioDao userdao = new UsuarioDao();
		userdao.Alterar(user);
		
		response.sendRedirect("http://localhost:8180/JavaWeb_Aula/mostrarusuarios");
		
	}

}
