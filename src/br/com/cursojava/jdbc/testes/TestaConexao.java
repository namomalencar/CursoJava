package br.com.cursojava.jdbc.testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.cursoja.jdbc.conexao.ConnectionFactory;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conectado");
		con.close();
		
	}

}
