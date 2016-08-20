package orientacaoObjetoClassica;

public class Gerente extends Funcionario {

	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}

}
