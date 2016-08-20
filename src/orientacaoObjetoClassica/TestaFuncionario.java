package orientacaoObjetoClassica;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.setNome("Namom");
		f1.setSalario(100);
		System.out.println("Salario atual: " + f1.getSalario());
		System.out.println(f1.calculaGanhoAnual());
		f1.recebeAumento(50);
		System.out.println("Salario depois do aumento: " + f1.getSalario());
		System.out.println(f1.calculaGanhoAnual());
		f1.mostra();
		Data dataDoF1 = new Data();
		f1.setDataDeEntrada(dataDoF1);
		f1.getDataDeEntrada().dia = 10;
		f1.getDataDeEntrada().mes = 10;
		f1.getDataDeEntrada().ano = 2016;
		f1.mostra();
		
		
		
		
		
		
		
		
		
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Jose");
		Funcionario f3 = f2; 
		f2.setNome("Maria");
		System.out.println("f3: "+ f3.getNome());
		System.out.println("f2: "+ f2.getNome());
		//= new Funcionario();
		//f3.nome = "Jose";
		if(f2 == f3){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
		
	}

}
