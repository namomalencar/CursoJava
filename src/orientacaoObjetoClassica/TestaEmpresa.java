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
		f1.setNome("Namom");
		f1.setSalario(100);
		
		objEmpresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario("Amanda");
		//f2.setNome("Amanda");
		f2.setSalario(200);
		
		objEmpresa.adiciona(f2);
		
		for(int i = 0 ; i<=10; i++){
			Funcionario f = new Funcionario();
			f.setNome("Nome "+i);
			f.setSalario(100 *i);
			objEmpresa.adiciona(f);
		}
		
		f1.setEstaAtivo(true);
		objEmpresa.verificarFuncionario(f1);

		Funcionario f16 = new Funcionario();
		f16.setEstaAtivo(true);
		f16.setNome("Aviao de caça");
		objEmpresa.verificarFuncionario(f16);
		
		objEmpresa.mostraFuncionariosDaEmpresa();
		
		
	}
}
