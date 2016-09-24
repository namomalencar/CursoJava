package br.com.cursojava.banco;

import br.com.cursojava.banco.conta.ContaCorrente;
import br.com.cursojava.banco.interfaces.Tributavel;
import br.com.cursojava.banco.util.GerenciadorDeImpostoDeRenda;
import br.com.cursojava.banco.util.SeguroDeVida;

public class TesteTributavel {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		gerenciador.adiciona(t);
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		//System.out.println(gerenciador.getTotal());
		System.out.printf("O saldo é: %.2f",gerenciador.getTotal());
	}

}
