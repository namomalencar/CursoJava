package orientacaoObjetoClassica;

public class Banco {
	
	private Conta [] todasAsContasdoBanco;
	private int pos = 0;
	
	public Banco(){
		
	}
	
	public Banco(int tam){
		this.todasAsContasdoBanco = new Conta[tam];
	}

	public void adcionarConta(Conta c){
		this.todasAsContasdoBanco[pos] = c;
		this.pos = this.pos + 1;
	}
	
	public Conta pegaConta(int x){
		return this.todasAsContasdoBanco[x];
	}
	
	public int pegaTotalDeContas(){
		return this.pos;
	}
	
	
}
