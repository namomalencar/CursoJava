package orientacaoObjetoClassica;

public class Cliente implements Autenticavel{
	
	String nomeDoTitular;
	Data dataDeNascimento;
	String cpf;
	String endereco;
	private int senha; 
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha)
			return true;
		return false;
	}

}
