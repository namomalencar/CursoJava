package br.com.cursojava.banco;

import br.com.cursojava.banco.conta.ContaCorrente;
import br.com.cursojava.banco.conta.ContaPoupanca;
import br.com.cursojava.banco.util.ControleDeContas;

public class TestaBanco {
	
	public static void main(String[] args) {
		Banco banco = new Banco(10);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(300);
		banco.adcionarConta(cc);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(300);
		banco.adcionarConta(cp);
		
		int tamanho = banco.pegaTotalDeContas();
		ControleDeContas controle = new ControleDeContas();
		double taxa = 0.2;
		for(int i = 0; i<tamanho;i++){
			controle.atualizandoConta(banco.pegaConta(i), taxa);
		}
		
		
	}

}
