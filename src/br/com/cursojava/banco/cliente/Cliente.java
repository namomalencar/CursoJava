package br.com.cursojava.banco.cliente;

import br.com.cursojava.banco.interfaces.Autenticavel;
import br.com.cursojava.banco.util.Data;

public class Cliente implements Autenticavel{
	
	private String nomeDoTitular;
	Data dataDeNascimento;
	String cpf;
	String endereco;
	private int senha; 
	
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha)
			return true;
		return false;
	}

}
