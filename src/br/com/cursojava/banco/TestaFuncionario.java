package br.com.cursojava.banco;

import br.com.cursojava.banco.funcionario.Funcionario;
import br.com.cursojava.banco.funcionario.Gerente;
import br.com.cursojava.banco.util.Bonificacao;
import br.com.cursojava.banco.util.Data;

public class TestaFuncionario {

	public static void main(String[] args) {
		//Funcionario f1 = new Funcionario();
		Gerente f1 = new Gerente();
		f1.setNome("Namom");
		f1.setSalario(100);
		System.out.println("Salario atual: " + f1.getSalario());
		System.out.println(f1.calculaGanhoAnual());
		f1.recebeAumento(50);
		System.out.println("Salario depois do aumento: " + f1.getSalario());
		System.out.println(f1.calculaGanhoAnual());
		f1.mostra();
		System.out.println("A bonificação do funcionario "+f1.getNome()+" é: "+f1.getBonificacao());
		Data dataDoF1 = new Data();
		f1.setDataDeEntrada(dataDoF1);
		f1.getDataDeEntrada().setDataCompleta(10, 10, 2016);
//		f1.getDataDeEntrada().dia = 10;
//		f1.getDataDeEntrada().mes = 10;
//		f1.getDataDeEntrada().ano = 2016;
		f1.mostra();
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Jose");
		f2.setSalario(1000);
		
		Bonificacao b = new Bonificacao();
		b.resgistra(f1);
		System.out.println(b.getTotalDeBonicacoes());
		b.resgistra(f2);
		System.out.println(b.getTotalDeBonicacoes());
	}

}
