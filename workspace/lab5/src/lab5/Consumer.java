package lab5;
public class Consumer extends Thread {
private Thread t;
private int wait;
private String Fifo_string;
private String string;
private Fifo fifo;
private long time;
private boolean foo;
	Consumer(Fifo f, String s, int i)
	{
		fifo = f;
		string = s;
		wait = i;
	}
	
	public void run()
	{
		while(true)
		{
			time = System.currentTimeMillis()%100000;
			try {
				Fifo_string = fifo.get();
				foo=true;
			}
			catch(IsEmpty  e){
				foo=false;
			}
			if(foo==true)
			System.out.println("consumed"+" "+string+" "+Fifo_string+"  "+time);
			try {
				Thread.sleep(wait);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
