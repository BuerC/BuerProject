package lab5;

public class Main {

	public static void main(String[] args) {
	
		Fifo f = new Fifo();
		Producer p = new Producer("product",f,1000);
		p.start();
		
	}

}
