package teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TesteComScanner {
	
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new FileInputStream("arquivo.txt"));
			while(s.hasNextLine())
				System.out.println(s.nextLine());
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("Isto é uma exception - "+e.getMessage());
		}
		
	}
	
}
