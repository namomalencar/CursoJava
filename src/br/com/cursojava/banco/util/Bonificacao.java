package br.com.cursojava.banco.util;

import br.com.cursojava.banco.funcionario.Funcionario;

public class Bonificacao {
	
	private double totalDeBonificacoes = 0;
	
	public void resgistra(Funcionario f){
		this.totalDeBonificacoes += f.getBonificacao();
	}
	
	public double getTotalDeBonicacoes(){
		return this.totalDeBonificacoes;
	}
	

}
