package orientacaoObjetoClassica;

public class Conta {
	
	private static int totalDeContas;
	private int numeroDaConta;
	private Cliente titular;
	private double saldo;
	private double limite;
	
	public void saca(double valor){
		this.saldo = this.saldo-valor;
	}
	
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public void transfere(Conta outraConta, double valor){
		this.saca(valor);
		outraConta.deposita(valor);
		System.out.println("Transferencia Concluida");
	}
	
	public void atualiza(double taxa){
		this.saldo += this.saldo*taxa;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	

}
