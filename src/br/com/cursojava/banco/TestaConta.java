package br.com.cursojava.banco;

import br.com.cursojava.banco.conta.ContaCorrente;
import br.com.cursojava.banco.conta.ContaPoupanca;
import br.com.cursojava.banco.util.ControleDeContas;

public class TestaConta {
	
	public static void main(String[] args) {

		ControleDeContas controle = new ControleDeContas();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		cc.deposita(300);
		cp.deposita(300);
		double taxa = 0.2;
		controle.atualizandoConta(cc, taxa);
		controle.atualizandoConta(cp, taxa);
		System.out.println("O saldo total do banco é: "+controle.getSaldoTotal());
		
		
		/* Exercicio 4 
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(300);
		System.out.println("Conta Corrente anterior: "+cc.getSaldo());
		cc.atualiza(0.2);
		System.out.println("Conta Corrente novo: "+cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(300);
		System.out.println("Conta Poupanca Anterior: "+cp.getSaldo());
		cp.atualiza(0.2);
		System.out.println("Conta Poupanca novo: "+cp.getSaldo());
		*/
	}

}
