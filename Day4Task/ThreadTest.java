package Day4Task;



class threads implements Runnable
{
	public void run()
	{
	try
	{
		Thread.sleep(1500);//sleep method is used to sleep a thread for the specifice amount of time
	}
	catch(InterruptedException f)
	{
		f.printStackTrace();
	}
	System.out.println("state of thread1 while it called join method on thread2="+ThreadTest.thread1.getState());
	
	try
	{
		Thread.sleep(200);
	}
	catch(InterruptedException f)
	{
		f.printStackTrace();
	}
}

}
public class ThreadTest implements Runnable {
	
	public static Thread thread1;
	public static ThreadTest obj;
	
	public void run()
	{
		threads ob1=new threads();
		Thread thread2=new Thread(ob1);
		
		//thread2 is created and currently in new state
		System.out.println("state of the threa2 after creating it="+thread2.getState());
		
		
		thread2.start();
		System.out.println("state of the thread2 after calling the start method="+thread2.getState());
		
		//moving thread1 to timed waiting state
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("state of thread2 after calling the sleep method on it="+thread2.getState());
		
		
		try
		{
			//waiting for thread2 to die
			thread2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("state of the thread 2 when it has finished its execution="+thread2.getState());
	}

	public static void main(String[] args) {
		
		obj=new ThreadTest();
		thread1=new Thread(obj);
		
		//thread1 is created and currently in new state
		System.out.println("state of the thread1 after creating it="+thread1.getState());
		
		//after calling start method
		thread1.start();
		System.out.println("state of the thread1 after calling the start method="+thread1.getState());
		
		

	}

}
