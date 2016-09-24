package br.com.cursojava.banco.empresa;

import br.com.cursojava.banco.funcionario.Funcionario;

public class Empresa {

	private String nomeDaEmpresa;
	private String cnpj;
	private Funcionario empregados[];
	private int pos = 0;

	public Empresa() {
	}

	public Empresa(int i) {
		this.empregados = new Funcionario[i];
	}

	public void adiciona(Funcionario f) {
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

	public void verificarFuncionario(Funcionario f) {
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

	public void mostraFuncionariosDaEmpresa() {
		for (int i = 0; i < pos; i++) {
			Funcionario f = empregados[i];
			f.mostra();
			System.out.println("===================");
		}
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

}
