package orientacaoObjetoClassica;

public class GerenciadorDeImpostoDeRenda {

	private double total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adicionando Tributavel: " +t.toString());
		this.total = this.total + t.calculaTributos();
	}
	public double getTotal(){
		return this.total;
	}
	
}
