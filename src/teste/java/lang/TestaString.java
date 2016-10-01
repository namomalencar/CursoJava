package teste.java.lang;

public class TestaString {
	
	public static void main(String[] args) {
		String a = new String("str11");
		System.out.println(a.replaceAll("1", "2").toUpperCase());
		
		String b = "abcde";
		String c = "cX";
		
		if(b.contains(c)){
			System.out.println(c +" esta contido em "+b);
		}else{
			System.out.println(c +" NÃO esta contido em "+b);
		}
		
		
		String d = "       eu sou uma string        ";
		System.out.println(d);
		System.out.println(d.trim());
		
		
		String e = "";
		String f = "naovazia";
		
		if(e.isEmpty()){
			System.out.println("String de variavel 'e'  esta vazia");
		}
		if(f.isEmpty()){
			System.out.println("String de variavel 'f' esta vazia");
		}
		
		String g = "123456";
		System.out.println(g.length());
		
		
	}

}
