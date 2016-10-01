package teste.object;

import br.com.cursojava.banco.conta.Conta;
import br.com.cursojava.banco.conta.ContaCorrente;
import br.com.cursojava.banco.funcionario.Funcionario;
import br.com.cursojava.banco.funcionario.Gerente;

public class TestaGuardador {
	
	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		Conta conta = new ContaCorrente();
		guardador.adicionaObjeto(conta);
		
		Object obj = guardador.pegaObjeto(0);
		
		System.out.println(((Conta) obj).getSaldo());
		
		Funcionario func = new Gerente();
		
		guardador.adicionaObjeto(func);
		
		Object obj2 = guardador.pegaObjeto(1);
		
		Funcionario func2 = (Gerente) obj2;
		Funcionario func3 = new Gerente();
		
		/*Comparacao com equals*/
		func.setRg("12345");
		func3.setRg("12345");
		
		if(func != func3){
			System.out.println("Sao diferentes!");
		}
		
		if(func.equals(conta)){
			System.out.println("É o mesmo funcionario com RG: "+func3.getRg());
		}else{
			System.out.println("Opss, algo de errado");
		}
		
		if(func.equals(func3)){
			System.out.println("É o mesmo funcionario com RG: "+func3.getRg());
		}
		
		
		
	}

}
