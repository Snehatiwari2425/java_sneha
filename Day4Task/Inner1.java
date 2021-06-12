package Day4Task;

//member inner class

public class Inner1 {
	
	private int data=50;
	class Inner
	{
		void msg()
		{
			System.out.println("data="+data);
		}
	}

	public static void main(String[] args) {
		
		Inner1 t1=new Inner1();
		Inner1.Inner in=t1.new Inner();
		in.msg();
		

	}

}
