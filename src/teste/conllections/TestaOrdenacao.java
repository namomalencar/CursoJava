package teste.conllections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.cursojava.banco.conta.ContaCorrente;
import br.com.cursojava.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {	
		
		/*
		ContaCorrente cm1 = new ContaCorrente();
		cm1.deposita(10000);
		ContaCorrente cm2 = new ContaCorrente();
		cm2.deposita(3000);

		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();

		mapaDeContas.put("diretor", cm1);
		mapaDeContas.put("gerente", cm2);

		ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor);
		System.exit(0);

		Set<String> cargos = new HashSet<>();
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Diretor");// repetido
		System.out.println(cargos);
		System.exit(0);
*/
		List<String> lista = new ArrayList<>();
		lista.add("Marcos Monteiro");
		lista.add("Namom");
		lista.add("Angelo Brayner");
		System.out.println(lista);
		Collections.sort(lista, new ComparadorPorTamanho());
		System.out.println(lista);
		System.exit(0);
		
		
		
		
		
		
		
		
		
		
		ContaPoupanca c1 = new ContaPoupanca();
		ContaPoupanca c2 = new ContaPoupanca();
		ContaPoupanca c3 = new ContaPoupanca();
		List<ContaPoupanca> listaContas = new LinkedList<>();
		listaContas.add(c3);
		listaContas.add(c2);
		listaContas.add(c1);

		for (int i = 0; i < listaContas.size(); i++) {
			ContaPoupanca aux = listaContas.get(i);
			System.out.println("Numero da conta: " + aux.getNumeroDaConta());
		}

		System.out.println("Executando a ordenacao");
		Collections.sort(listaContas);
		System.out.println("Fim da ordenacao");

		for (int i = 0; i < listaContas.size(); i++) {
			ContaPoupanca aux = listaContas.get(i);
			System.out.println("Numero da conta: " + aux.getNumeroDaConta());
		}
	}

}
