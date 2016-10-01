package teste.java.lang;

import java.io.PrintStream;

public class TestaInteger {
	
	public static void main(String[] args) {
		
		String a = "100";
		String b = "abcd";
		PrintStream saida = System.out;

		int c = Integer.parseInt(a);
		saida.println(c);
		int d = Integer.parseInt(b);
		saida.println(d);
		
	}

}
