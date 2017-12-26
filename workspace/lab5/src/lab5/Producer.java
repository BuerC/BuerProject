package lab5;
import java.io.*;
public class Producer extends Thread{
	//we make a thread cause we want to instantiate with the  Thread constructor
	private String text;
	private int number;
	private long time;
	private Fifo fifo;
	private String text_number;
	private int wait;
	Producer(String t, Fifo fifo1, int x)
	{
		text  = t;
		fifo = fifo1;
		wait  = x;
	}
	public void run()
	{
		number =  0;
		while(true)
		{
			time = System.currentTimeMillis()%100000;
			text_number = text+" "+number;
				fifo.put(text_number);
				System.out.println("Produced"+" "+text_number+" "+time);
				number++;
			
				try {
					Thread.sleep(wait);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			
			
	}
		
	}
	}}
