package orientacaoObjetoClassica;

public class Empresa {

	String nomeDaEmpresa;
	String cnpj;
	Funcionario empregados[];
	int pos = 0;

	void adiciona(Funcionario f) {
		if (pos < empregados.length) {
			empregados[pos] = f;
			pos = pos + 1;
		} else {
			Funcionario empregadosAux[] = empregados;
			empregados = new Funcionario[pos + 5];
			populaNovoArray(empregadosAux, f);
		}
	}

	private void populaNovoArray(Funcionario[] empregadosAux, Funcionario f) {
		for (int i = 0; i < empregadosAux.length; i++) {
			empregados[i] = empregadosAux[i];
		}
		empregados[empregadosAux.length] = f;
		pos = empregadosAux.length;
	}

	void verificarFuncionario(Funcionario f) {
		for (int i = 0; i < pos; i++) {
			if (empregados[i] == f) {
				if (empregados[i].getEstaAtivo() == true) {
					System.out.println("O funcionario " + empregados[i].getNome() + " esta ativo");
				} else {
					System.out.println("O funcionario " + empregados[i].getNome() + " NAO esta ativo");
				}
			}
		}
	}

	void mostraFuncionariosDaEmpresa() {
		for (int i = 0; i < pos; i++) {
			Funcionario f = empregados[i];
			f.mostra();
			System.out.println("===================");
		}
	}

}
