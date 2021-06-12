package Day3Task;

//method overloading

public class MethodOver {
	
	public static int add(int a,int b)//no .of argument 2
	{
		int sum=a+b;
		return sum;
	}
	
	public static int add(int a,int b,int c)//no.of argument 3
	{
		int total=a+b+c;
		return total;
	}
	
	public static float multiply(int a,float b) {//type of argument is int and float
		float m=a*b;
		return m;
	}
	
	public static float multiply(int a,int b) {//type of argument is int
		float m=a*b;
		return m;
	}

	public static void main(String[] args) {
		
        int total=add(2,3);
        System.out.println("sum="+total);
       int sum= add(2,3,4);
       System.out.println("sum="+sum);
       float m=multiply(2,5.2f);
       System.out.println("result="+m);
       float f=multiply(5,5);
       System.out.println("result="+f);
	}

}
