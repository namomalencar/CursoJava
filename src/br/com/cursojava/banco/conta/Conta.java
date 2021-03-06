package br.com.cursojava.banco.conta;

import br.com.cursojava.banco.cliente.Cliente;
import br.com.cursojava.banco.exception.ValorInvalidoException;

public abstract class Conta {
	
	protected static int totalDeContas;
	private int numeroDaConta;
	protected Cliente titular;
	
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	protected double saldo;
	private double limite;
	
	
	
	public void saca(double valor){
		this.saldo = this.saldo-valor;
	}
	
	public void deposita(double valor) throws ValorInvalidoException{
		if(valor < 0){
			throw new ValorInvalidoException("Nao � possivel depositar valores menor que zero, "
					+ "voc� tentou depositar: "+valor);
		}else{
			this.saldo = this.saldo + valor;	
		}
		
	}
	
	public void transfere(Conta outraConta, double valor){
		this.saca(valor);
		try {
			outraConta.deposita(valor);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Transferencia Concluida");
	}
	
	public abstract void atualiza(double taxa);
	
	public double getSaldo(){
		return this.saldo;
	}
	
	@Override
	public String toString(){
		return "Esta conta possui "+this.getSaldo()+ " de saldo e o titular �: "+this.getTitular().getNomeDoTitular();
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	protected void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

}
