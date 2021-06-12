package Day3Task;



public class ConstructOver {

	public static ConstructOver c1,c2;
	public ConstructOver()//constructor without parameter
	{
		System.out.println("default constructor");
	}
	
	public ConstructOver(int a)//parameter constructor
	{
		System.out.println("parameter constructor and the value="+a);
	}
	
	public static void main(String[] args) {
		
		c1=new ConstructOver();
		c2=new ConstructOver(2);
		

	}

}
