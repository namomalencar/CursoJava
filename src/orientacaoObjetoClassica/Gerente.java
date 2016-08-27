package orientacaoObjetoClassica;

public class Gerente extends Funcionario {

	private int senha;
	private int numeroDeFuncionariosGerenciados;

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}
	
	public void demitirFuncionario(Funcionario f){
		//Do Staff
	}

}
