package br.com.cursojava.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.cursojava.banco.conta.Conta;

public class Banco {
	
	private Map<String, Conta> todasAsContasdoBanco = new HashMap<>();
	
	public void adcionarConta(Conta c){
		this.todasAsContasdoBanco.put(c.getTitular().getNomeDoTitular(), c);
	}
	
	public Conta pegaConta(int x){
		return this.todasAsContasdoBanco.get(x);
	}
	
	public Conta pegaContaPeloNome(String nome){
		return this.todasAsContasdoBanco.get(nome);
	}
	
	public int pegaTotalDeContas(){
		return this.todasAsContasdoBanco.size();
	}
	
	
}
