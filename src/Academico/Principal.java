package Academico;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		menuOpcoes();
	}

	private static void menuOpcoes() {
		Scanner s = new Scanner(System.in);
		String escolha = "";
		System.out.println("===Opções===");
		System.out.println("1 - Para inserir novo aluno");
		System.out.println("Qualquer outro caracter para sair");
		escolha = s.nextLine().toUpperCase();
		switch (escolha) {
		case ("1"):
			inserirAluno();
		default:
			System.out.println("Fim");
			break;
		}

	}

	public static void inserirAluno() {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserir nova nota para um aluno");
		System.out.println("Digite o nome do aluno: ");
		String nome = s.nextLine();
		Aluno aluno = new Aluno(nome);
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
		menuOpcoes();
	}

}
