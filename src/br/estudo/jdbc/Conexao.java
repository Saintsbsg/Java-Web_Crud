package br.estudo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection receberConexao() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/aula?useSSL=false", "root", "79787753");
			System.out.println("Banco de dados conectado com sucesso");
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println("Não foi possivel conectar ao banco de dados");
			e.printStackTrace();
		}
		
		return con;
	}
}
