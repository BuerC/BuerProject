package lab5;

public class Application {

	public static void main(String[] args) {
		
		Fifo fifo = new Fifo();
		Producer producer1 = new Producer( "Product",fifo,5000);
		producer1.start();
		Consumer consumer1 = new Consumer(fifo,"BME", 2000);
		consumer1.start();
	
	}

}
