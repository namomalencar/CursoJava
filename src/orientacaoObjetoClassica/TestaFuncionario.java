package orientacaoObjetoClassica;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.nome = "Namom";
		f1.salario = 100;
		System.out.println("Salario atual: " + f1.salario);
		System.out.println(f1.calculaGanhoAnual());
		f1.recebeAumento(50);
		System.out.println("Salario depois do aumento: " + f1.salario);
		System.out.println(f1.calculaGanhoAnual());
		f1.mostra();
		Data dataDoF1 = new Data();
		f1.dataDeEntrada = dataDoF1;
		f1.dataDeEntrada.dia = 10;
		f1.dataDeEntrada.mes = 10;
		f1.dataDeEntrada.ano = 2016;
		f1.mostra();
		
		
		
		
		
		
		
		
		
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Jose";
		Funcionario f3 = f2; 
		f2.nome ="Maria";
		System.out.println("f3: "+ f3.nome);
		System.out.println("f2: "+ f2.nome);
		//= new Funcionario();
		//f3.nome = "Jose";
		if(f2 == f3){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
		
	}

}
