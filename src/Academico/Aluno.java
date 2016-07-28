package Academico;

public class Aluno {
	private String nome;
	private float nota1;
	private float nota2;
	String matricula;

	// Constructor
	/*
	 * public Aluno(String nome) { this.nome = nome; this.nota1 = -1; this.nota2
	 * = -1; }
	 */
	public Aluno(String matricula, String nome) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = -1;
		this.nota2 = -1;
	}

	public Aluno() {
		this.nota1 = -1;
		this.nota2 = -1;
	}

	/*
	 * GETTERS AND SETTERS
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public void imprimirResultado() {
		float media = calcMedia();
		if (media >= 7) {
<<<<<<< HEAD
			System.out.println("O aluno " + nome + " foi aprovado com a media: " + media);
//			System.exit(0);
		}

		if (media >= 5) {
			System.out.println("O aluno " + nome + " ficou de recuperação com a media: " + media);
//			System.exit(0);
		}

		if (media >= 4) {
			System.out.println("O aluno " + nome + " ficou de recuperação + trabalho com a media: " + media);
//			System.exit(0);
		}

		if (media < 4) {
			System.out.println("O aluno " + nome + " foi reprovado com a media: " + media);
//			System.exit(0);
=======
			System.out.println("O aluno " + nome + " com matricula "+matricula+" foi aprovado com a media: " + media);
		}

		if (media >= 5 && media < 7) {
			System.out.println("O aluno " + nome + " com matricula "+matricula+" ficou de recuperação com a media: " + media);
		}

		if (media >= 4 && media < 5) {
			System.out.println("O aluno " + nome + " com matricula "+matricula+" ficou de recuperação + trabalho com a media: " + media);
		}

		if (media < 4) {
			System.out.println("O aluno " + nome + " com matricula "+matricula+" foi reprovado com a media: " + media);
>>>>>>> 2591725892abe91f49191a5ad02bcfb5c0c2bac1
		}
	}

	public float calcMedia() {

		return (this.nota1 + this.nota2) / 2; // posso tambem chamar a variavel
												// direto sem o this
	}

}
