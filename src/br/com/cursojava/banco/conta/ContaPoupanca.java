package br.com.cursojava.banco.conta;


public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca() {
		Conta.totalDeContas += 1;
		this.setNumeroDaConta(Conta.totalDeContas);
	}

	public void atualiza(double taxa) {
		this.saldo = this.saldo * (taxa * 3);
	}
	
	public int compareTo(ContaPoupanca outro) {
		return Integer.compare(this.getNumeroDaConta(), outro.getNumeroDaConta());
	}

	/*
	@Override
	public int compareTo(ContaPoupanca outro) {
		if (this.getNumeroDaConta() < outro.getNumeroDaConta()) {
			return -1;
		}
		if (this.getNumeroDaConta() > outro.getNumeroDaConta()) {
			return 1;
		}
		return 0;
	}*/

}
