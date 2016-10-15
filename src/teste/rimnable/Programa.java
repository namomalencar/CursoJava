package teste.rimnable;

public class Programa implements Runnable {

	private int id;

	@Override
	public void run() {
		for(int i =0; i<900000;i++){
			System.out.println("Programa: "+this.id+" valor: "+i);
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
