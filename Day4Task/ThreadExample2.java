package Day4Task;

public class ThreadExample2  extends Thread{
	
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
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ThreadExample2 t1=new ThreadExample2();
		ThreadExample2 t2=new ThreadExample2();
		
		t1.run();//no context switching
		t2.run();

	}

}
