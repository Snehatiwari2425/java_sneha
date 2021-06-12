//here we wil learn about all the concept of variable

package Day1Task;
public class Variable {
	static int a=10;//static variable scope of this all over the class
	int b=20;//instance variable scope with in the class 
	public void show()
	{
		int c=30;//local variable scope with in the body
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variable v=new Variable();
		System.out.println(a);//static variable without object call
		System.out.println(v.b);//calling instance variable with object
		v.show();

	}

}
