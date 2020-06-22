package br.estudo.teste;

import java.util.Scanner;

import br.estudo.dao.UsuarioDao;
import br.estudo.modelo.Usuario;


public class TesteBuscaPorId {

	public static void main(String[] args) {
		UsuarioDao usuariodao = new UsuarioDao();
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o id do usuario que deseja buscar: ");
		int id = leitor.nextInt();
		
		Usuario usuario = usuariodao.buscarPorId(id);
		
		
		
		System.out.println("Id: " + usuario.getId());
		System.out.println("Nome: " + usuario.getNome());
		System.out.println("Login: " + usuario.getLogin());
		System.out.println("Senha: " + usuario.getSenha());
		
	}

}
