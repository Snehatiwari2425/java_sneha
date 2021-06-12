package Day4Task;

public class JoinExample extends Thread {
	
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
		JoinExample t1=new JoinExample();
		JoinExample t2=new JoinExample();
		JoinExample t3=new JoinExample();
		t1.start();
		
		try
		{
			t1.join();
			//t1.join(500)
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(t2.getName());//it is method to get name
		System.out.println(t3.getName());
		System.out.println(t2.getId());
		t2.start();
		t3.start();
		t2.setName("sneha");//method to change the name
		System.out.println("after changine the name of t2="+t2.getName());

	}

}
