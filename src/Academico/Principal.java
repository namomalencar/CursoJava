package Academico;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		Aluno aluno = new Aluno(s.nextLine());
		System.out.println("Digite a sua primeira nota " + aluno.getNome() + ": ");

		while (aluno.getNota1() < 0 || aluno.getNota1() > 10) {
			aluno.setNota1(s.nextFloat());
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
	}

}
