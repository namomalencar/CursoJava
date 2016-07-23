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
	}

}
