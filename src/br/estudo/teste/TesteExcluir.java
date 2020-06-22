package br.estudo.teste;

import java.util.List;
import java.util.Scanner;



import br.estudo.dao.UsuarioDao;
import br.estudo.modelo.Usuario;

public class TesteExcluir {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o ID do usuario que deseja excluir: ");
		int id = leitor.nextInt();
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.Excluir(id);
		
		//Mostrar todos os usuarios após a exclusão
		
		
		List<Usuario> usuarios = usuarioDao.mostrarUsuarios();
		
		for(Usuario usuario:usuarios) {
			System.out.println(usuario.getId() + " - " + usuario.getNome() + " - " + usuario.getLogin() + " - " + usuario.getLogin());
		}
	}

}
