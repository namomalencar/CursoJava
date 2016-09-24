package br.com.cursojava.banco;

import br.com.cursojava.banco.conta.Conta;
import br.com.cursojava.banco.conta.ContaPoupanca;
import br.com.cursojava.banco.exception.ValorInvalidoException;

public class TesteDeposita {
	
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
			try {
				cp.deposita(-100);
			} catch (ValorInvalidoException e) {
				System.out.println(e.getMessage());
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		
		
	}

}
