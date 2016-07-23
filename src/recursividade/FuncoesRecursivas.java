package recursividade;

public class FuncoesRecursivas {
	public static void main(String[] args) {
		System.out.println(fatorialIteraivo(5));
		System.out.println(fatorialRecursivo(5));
		System.out.println(fibonacciIterativo(6));
		System.out.println(fibonacciRecursivo(0));
	}

	private static int fibonacciRecursivo(int x) {
		if (x < 2) {
			return x;
		} else {
			return fibonacciRecursivo(x - 1) + fibonacciRecursivo(x - 2);
		}
	}

	private static int fibonacciIterativo(int x) {
		int atual = 0;
		int anterior = 0;
		for (int i = 1; i <= x; i++) {
			if (i == 1) {
				atual = 1;
				anterior = 0;
			} else {
				atual = atual + anterior;
				anterior = atual - anterior;
			}
		}
		return atual;
	}

	private static int fatorialRecursivo(int x) {
		if (x == 1) {
			return 1;
		} else {
			return fatorialRecursivo(x - 1) * x;
		}
	}

	private static int fatorialIteraivo(int x) {
		int fatorial = 1;
		for (int i = x; i >= 1; i--) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

}
