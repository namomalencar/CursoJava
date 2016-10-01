package teste.io;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {

	public static void main(String[] args) {
		InputStream is2 = System.in;
//		InputStream is;
//		InputStreamReader isr;
		InputStreamReader isr2 = new InputStreamReader(is2);
		BufferedReader br = null;
		BufferedReader br2 = new BufferedReader(isr2);
		System.out.println("Digite o nome do arquivo: ");
		String caminho = "";
		
		try {
			caminho = br2.readLine();
		} catch (IOException e2) {
			System.out.println(e2.getMessage());
		}
		
		try {
			//is = new FileInputStream(caminho+".txt");
			//isr = new InputStreamReader(is);
			br = new BufferedReader(new InputStreamReader(new FileInputStream(caminho+".txt")));
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		}

		String linha;
		try {
			linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				//br.close();
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
