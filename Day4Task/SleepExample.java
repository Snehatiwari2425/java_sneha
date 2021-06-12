package Day4Task;

public class SleepExample  extends Thread{

	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		SleepExample s1=new SleepExample();
		SleepExample s2=new SleepExample();
		
		s1.start();
		s2.start();
		//s2.start();//if we start a thread twic it wll throw an error

	}

}
