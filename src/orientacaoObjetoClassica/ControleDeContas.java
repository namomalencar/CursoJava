package orientacaoObjetoClassica;

public class ControleDeContas {
	
	private double saldoTotal = 0;
	
	public void atualizandoConta(Conta c, double taxa){
		System.out.println("Saldo antes: "+c.getSaldo());
		c.atualiza(taxa);
		System.out.println("Saldo depois: "+c.getSaldo());
		this.atualizaSaldoTotal(c.getSaldo());
	}
	
	private void atualizaSaldoTotal(double valor){
		this.saldoTotal += valor;
	}
	
	public double getSaldoTotal(){
		return this.saldoTotal;
	}
	

}
