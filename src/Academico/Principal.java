package Academico;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
	static Matricula matricula = new Matricula();
	int x = matricula.matricula;

	public static void main(String[] args) {
		menuDeOpcoes();
	}

	private static void menuDeOpcoes() {
		Scanner s = new Scanner(System.in);
		String escolha = "";
		String nome = "";
		int posicao;
		int result;
		System.out.println("===========Opções===========");
		System.out.println("Escolha uma opção");
		System.out.println("S - Inserir novo aluno");
		System.out.println("L - Listar os alunos com notas");
		System.out.println("B - Buscar Aluno");
		System.out.println("A - Alterar Aluno");
		System.out.println("E - Excluir Aluno");
		System.out.println("Qualquer outra coisa para sair");
		escolha = s.nextLine().toUpperCase();
		switch (escolha) {
		case ("S"):
			inserirAluno();
			break;
		case ("L"):
			listarAlunos();
			break;
		case ("B"):
			System.out.println("Digite o nome do aluno a ser buscado:");
			nome = s.nextLine();
			posicao = buscarAlunoPeloNome(nome);
			if (posicao >= 0) {
				System.out.println("O aluno " + nome + " existe na lista");
			}
			menuDeOpcoes();
			break;
		case ("E"):
			System.out.println("Digite o nome do aluno a ser excluido:");
			posicao = buscarAlunoPeloNome(s.nextLine());
			excluirAluno(posicao);
			menuDeOpcoes();
			break;
		case ("A"):
			System.out.println("Digite o nome do aluno a ser alterado:");
			nome = s.nextLine();
			posicao = buscarAlunoPeloNome(nome);
			if (posicao >= 0) {
				editarAluno(posicao);
			}
			menuDeOpcoes();
			break;
		default:
			System.out.println("Fim do programa!");
			break;
		}

	}

	private static void editarAluno(int posicao) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o novo nome do " + listaDeAlunos.get(posicao).getNome() + " que tem matricula"
				+ listaDeAlunos.get(posicao).matricula + ": ");
		listaDeAlunos.get(posicao).setNome(s.nextLine());
		System.out.println("N - Alterar notas");
		System.out.println("V - Voltar");
		switch (s.nextLine().toUpperCase()) {
		case ("N"):
			alterarNotas(posicao);
			break;
		default:
			break;
		}
	}

	private static void alterarNotas(int posicao) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a nova nota 1 do " + listaDeAlunos.get(posicao).getNome() + " que tem matricula"
				+ listaDeAlunos.get(posicao).matricula + ": ");
		listaDeAlunos.get(posicao).setNota1(s.nextFloat());
		System.out.println("Digite a nova nota 2 do " + listaDeAlunos.get(posicao).getNome() + " que tem matricula"
				+ listaDeAlunos.get(posicao).matricula + ": ");
		listaDeAlunos.get(posicao).setNota2(s.nextFloat());
	}

	private static void excluirAluno(int posicao) {
		listaDeAlunos.remove(posicao);
	}

	private static int buscarAlunoPeloNome(String nome) {
		for (int i = 0; i < listaDeAlunos.size(); i++) {
			Aluno aluno = listaDeAlunos.get(i);
			if (aluno.getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		System.out.println("O aluno " + nome + " não existe na lista");
		return -1;
	}

	private static void listarAlunos() {
		for (Aluno aluno : listaDeAlunos) {
			aluno.imprimirResultado();
		}
		if (listaDeAlunos.isEmpty()) {
			System.out.println("Não tem aluno na lista");
		}
		menuDeOpcoes();
	}

	private static void inserirAluno() {
		Scanner s = new Scanner(System.in);
		matricula.novaMatricula();
		System.out.println("Digite o nome do aluno: ");
		Aluno aluno = new Aluno("2016" + matricula.matricula, s.nextLine());
		System.out.println("Digite a sua primeira nota " + aluno.getNome() + ": ");
		while (aluno.getNota1() < 0 || aluno.getNota1() > 10) {
			aluno.setNota1(Float.parseFloat(s.nextLine()));
			if (aluno.getNota1() < 0 || aluno.getNota1() > 10) {
				System.out.println("A nota nao pode ser menor que 0 ou maior que 10 ");
				System.out.println("Digite a nota novamente ");
			}
		}

		System.out.println("Digite a sua segunda nota " + aluno.getNome() + ": ");
		while (aluno.getNota2() < 0 || aluno.getNota2() > 10) {
			aluno.setNota2(s.nextFloat());
			if (aluno.getNota2() < 0 || aluno.getNota2() > 10) {
				System.out.println("A nota nao pode ser menor que 0 ou maior que 10 ");
				System.out.println("Digite a nota novamente  ");
			}
		}
		aluno.imprimirResultado();
		listaDeAlunos.add(aluno);
		menuDeOpcoes();

	}

}
