package br.com.cursojava.banco;

import br.com.cursojava.banco.cliente.Cliente;
import br.com.cursojava.banco.conta.ContaCorrente;
import br.com.cursojava.banco.conta.ContaPoupanca;
import br.com.cursojava.banco.util.ControleDeContas;

public class TestaBanco {
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(300);
		Cliente c2 = new Cliente();
		c2.setNomeDoTitular("Anonimo");
		cc.setTitular(c2);
		banco.adcionarConta(cc);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(600);
		Cliente c1 = new Cliente();
		c1.setNomeDoTitular("Messias");
		cp.setTitular(c1);
		banco.adcionarConta(cp);
		
		ContaPoupanca cp2 = (ContaPoupanca) banco.pegaContaPeloNome("Messias");
		
		System.out.println(cp2);
		
		System.exit(0);
		
		int tamanho = banco.pegaTotalDeContas();
		ControleDeContas controle = new ControleDeContas();
		double taxa = 0.2;
		for(int i = 0; i<tamanho;i++){
			controle.atualizandoConta(banco.pegaConta(i), taxa);
		}
		
		
	}

}
