package br.com.cursojava.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cursoja.jdbc.conexao.ConnectionFactory;
import br.com.cursojava.model.Contato;

public class ContatoDAO {
	
	private Connection conexao;
	public ContatoDAO(){
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Contato contato){
		String sql = "INSERT into contatos "
				+ "(nome, email, endereco, dataNascimento)"
				+ "values (?,?,?,?)";
		//Prepared Statement para inserir
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			//setar os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.execute();
			stmt.close();
			System.out.println("Contato adicionado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Contato> getLista(){
		List<Contato> contatos = new ArrayList<Contato>();
		try{
			String sql = "Select nome, email from contatos";
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				//Criar um objeto do tipo Contato
				Contato c = new Contato();
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				contatos.add(c);
			}
			rs.close();
			stmt.close();
			this.conexao.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		return contatos;
	}

}
