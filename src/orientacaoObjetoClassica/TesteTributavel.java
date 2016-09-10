package orientacaoObjetoClassica;

public class TesteTributavel {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		gerenciador.adiciona(t);
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		//System.out.println(gerenciador.getTotal());
		System.out.printf("O saldo é: %.2f",gerenciador.getTotal());
	}

}
