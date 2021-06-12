package Day4Task;

public class Daemon1 extends Thread{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread work");
		}
		else
		{
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		
		Daemon1 d1=new Daemon1();
		Daemon1 d2=new Daemon1();
		Daemon1 d3=new Daemon1();
		
		//d1.start();//it throws exception if we start before and set after
		
		d1.setDaemon(true);//now d1 is daemon thread
		
		d1.start();
		d2.start();
		d3.start();


	}

}
