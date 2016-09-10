package orientacaoObjetoClassica;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	private int numeroDeFuncionariosGerenciados;
	private String unidadeAlocado;

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}
	
	public void demitirFuncionario(Funcionario f){
		//Do Staff
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha && checarUnidadeValida())
			return true;
		return false;
	}

	private boolean checarUnidadeValida() {
		if(this.unidadeAlocado != null)
			return true;
		return false;
	}

}
