package teste.rimnable;

import sun.applet.Main;

public class TesteRunabble {
	
	public static void main(String[] args) {
		Programa p1 = new Programa();
		p1.setId(1);
		Thread t1 = new Thread(p1);
		
		Programa p2 = new Programa();
		p2.setId(2);
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();
		
		
	}

}
