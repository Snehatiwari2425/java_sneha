package Day3Task;



//interface
interface Paper
{
	int a=2;
	public void disp();//method signature
	
}
abstract class Exam{  //abstract class
	
	void show()
	{
		System.out.println("abstract class");
	}
	abstract void add(int a,int b); //abstract method
}

public class AbstractExam extends Exam implements Paper{
	void add(int a,int b) //implement abstract method.
	{
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	
	public void disp()
	{
		System.out.println("interface");
	}

	public static void main(String[] args) {
		AbstractExam ob=new AbstractExam();
		ob.add(2, 4);
		ob.show();
		ob.disp();

	}

}
