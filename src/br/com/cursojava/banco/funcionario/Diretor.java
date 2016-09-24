package br.com.cursojava.banco.funcionario;

import br.com.cursojava.banco.interfaces.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel{
	private int senha;
	private String regiaoAlocado;
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha && checarRegiaoValida())
			return true;
		return false;
	}
	
	private boolean checarRegiaoValida(){
		if(this.regiaoAlocado != null)
			return true;
		return false;
	}
	
}
