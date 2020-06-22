package br.estudo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.estudo.jdbc.Conexao;
import br.estudo.modelo.Usuario;

public class UsuarioDao {
	
	public void cadastrar(Usuario usuario) {
		
				Connection con = Conexao.receberConexao();
				
				
				String sql = "INSERT  INTO usuario(nome, login, senha) VALUES(?, ?, ?)";
				
			
				try {
				
					PreparedStatement preparador = con.prepareStatement(sql);
					preparador.setString(1, usuario.getNome());
					preparador.setString(2, usuario.getLogin());
					preparador.setString(3, usuario.getSenha());
					
					
					preparador.execute();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				};
				
				
				public List<Usuario> mostrarUsuarios(){
					Connection con = Conexao.receberConexao();
					String sql ="SELECT * FROM usuario";
					List<Usuario> usuarios = new ArrayList<>();
					try {
						PreparedStatement preparador = con.prepareStatement(sql);
						ResultSet resultado = preparador.executeQuery(); //executa a consulta na tabela
						
						
						while(resultado.next()) {
							Usuario usuario = new Usuario();
							usuario.setId(resultado.getInt("idUsuario"));
							usuario.setNome(resultado.getString("Nome"));
							usuario.setLogin(resultado.getString("Login"));
							usuario.setSenha(resultado.getString("Senha"));
							usuarios.add(usuario);						}
					}catch(SQLException e){
						e.getStackTrace();
					}
					return usuarios;
						
					
				}
				
				public Usuario buscarPorId(int id) {
					Connection con = Conexao.receberConexao();
					String sql = " SELECT * FROM usuario WHERE idUsuario = ? ";
					Usuario usuario = null;
					PreparedStatement preparador;
					try {
						preparador = con.prepareStatement(sql);
						preparador.setInt(1, id);
						ResultSet resultado = preparador.executeQuery();
						
						if(resultado.next()) {
							usuario = new Usuario();
							usuario.setId(resultado.getInt("idUsuario"));
							usuario.setNome(resultado.getString("Nome"));
							usuario.setLogin(resultado.getString("Login"));
							usuario.setSenha(resultado.getString("Senha"));
						}
						
					} catch (SQLException e) {
												e.printStackTrace();
					}
					
					return usuario;
				}
				
				public void  Excluir(int id) {
					Connection con = Conexao.receberConexao();
					String sql = "DELETE FROM usuario WHERE idUsuario =?";
					
					try {
						PreparedStatement preparador = con.prepareStatement(sql);
						preparador.setInt(1, id);
						
						preparador.execute();
						
						
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				public void Alterar(Usuario usuario) {
					Connection con = Conexao.receberConexao();
					String sql = "UPDATE usuario SET nome=?, login=?, senha=? WHERE idUsuario=?";
					
					
					try {
						PreparedStatement preparador = con.prepareStatement(sql);
						preparador.setString(1, usuario.getNome());
						preparador.setString(2, usuario.getLogin());
						preparador.setString(3, usuario.getSenha());
						preparador.setInt(4, usuario.getId());
						
						preparador.execute();
						
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

	
}
