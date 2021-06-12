package Day4Task;

public class LocalInner {
	
	private int data=50;
	void display()
	{
		class Local//local class
		{
			
		void msg()
		{
		 System.out.println("data="+data);
		}
		
		}
		Local l=new Local();
		l.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		LocalInner t1=new LocalInner();
		t1.display();

	}

}
