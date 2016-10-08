package teste.conllections;

import java.util.ArrayList;
import java.util.Collection;

public class TesteDePerformance {
	
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for(int i = 0; i< total;i++){
			teste.add(i);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Fim insere: "+(fim-inicio));
		
		inicio = System.currentTimeMillis();
		for(int i = 0; i<total;i++){
			teste.contains(i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Fim busca: "+(fim-inicio));
		
		
		
	}

}
