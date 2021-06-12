package Day4Task;

abstract class Person{
	abstract void eat();
}

public class Anonymous1 {
	
	static int data=20;
	static class Inner{//static nested class
		void msg()
		{
			System.out.println("data="+data);
		}
	}

	public static void main(String[] args) {
		
		Person p=new Person()//anonymous class
		{
			void eat()
			{
				System.out.println("nice fruits");
			}
		};
		p.eat();
		
		Anonymous1.Inner in=new Anonymous1.Inner();//object of static inner class
		in.msg();

	}

}
