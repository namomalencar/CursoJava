package br.com.cursojava.jdbc.testes;

import java.util.List;

import br.com.cursojava.dao.ContatoDAO;
import br.com.cursojava.model.Contato;

public class TesteInsere {
	
	public static void main(String[] args) {
		
		/*Contato c = new Contato();
		c.setNome("Davi");
		c.setEmail("Davi@namomalencar.com");
		c.setEndereco("Rua Feliz, 500 Fortaleza CE");
		c.setDataNascimento(Calendar.getInstance());
		//Gravando
		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(c);
		*/
	
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getLista();
		for(Contato c: contatos){
			System.out.println(c.getNome()+"-"+c.getEmail());
		}
		
	}

}
