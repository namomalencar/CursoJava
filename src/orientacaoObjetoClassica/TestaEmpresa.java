package orientacaoObjetoClassica;

public class TestaEmpresa {
	public static void main(String[] args) {
		
		//String abc [] = new String[-1];
		//abc[0] ="abncasd";
		//System.out.println(abc.length);
		//System.exit(0);
		
		Empresa objEmpresa = new Empresa();
		objEmpresa.nomeDaEmpresa = "Empresa do Milhão";
		objEmpresa.cnpj = "0001Algumacoisa";
		objEmpresa.empregados = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Namom";
		f1.salario = 100;
		
		objEmpresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Amanda";
		f2.salario = 200;
		
		objEmpresa.adiciona(f2);
		
		for(int i = 0 ; i<=10; i++){
			Funcionario f = new Funcionario();
			f.nome = "Nome "+i;
			f.salario = 100 *i;
			objEmpresa.adiciona(f);
		}
		
		f1.estaAtivo = true;
		objEmpresa.verificarFuncionario(f1);

		Funcionario f16 = new Funcionario();
		f16.estaAtivo = true;
		f16.nome = "Aviao de caça";
		objEmpresa.verificarFuncionario(f16);
		
		objEmpresa.mostraFuncionariosDaEmpresa();
		
		
	}
}
