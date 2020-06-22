package br.estudo.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.estudo.dao.UsuarioDao;
import br.estudo.jdbc.Conexao;
import br.estudo.modelo.Usuario;

public class TesteInserirUsuario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Usuario user1 = new Usuario();
		
		System.out.print("Nome: ");
		user1.setNome(leitor.next());
		
		System.out.print("Login: ");
		user1.setLogin(leitor.next());
		
		System.out.print("Senha: ");
		user1.setSenha(leitor.next());
		
		
		UsuarioDao usuariodao = new UsuarioDao();
		
		usuariodao.cadastrar(user1);
		
		
		
	}

}
