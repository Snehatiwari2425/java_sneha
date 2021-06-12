//here we learn about the rethrowing concept

package Day3Task;

public class Rethrow {

	public static void main(String[] args) {
		try {
			getdata1();
			getdata2();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("exception is handled by main method");
		}
	

	}
	static void getdata1()
	{
		System.out.println("welcome in getdata1!");
		try
		{
			int a=100/5;
			System.out.println("A="+a);
		}
		catch(ArithmeticException e)
		{
			throw e;
		}
	}
	static void getdata2()
	{
		System.out.println("welcome in getdata2!");
		try {
			int b=50/0;
			System.out.println("B="+b);
			
		}
		catch(ArithmeticException e)
		{
			throw e;
		}
	}

}
