package br.estudo.teste;

import br.estudo.dao.UsuarioDao;
import br.estudo.modelo.Usuario;

public class TesteUpdate {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		usuario.setId(3);
		usuario.setNome("Rodeio");
		usuario.setLogin("Rodeiorj");
		usuario.setSenha("13242f");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.Alterar(usuario);
	}

}
