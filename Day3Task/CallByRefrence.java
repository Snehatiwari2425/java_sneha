package Day3Task;


class Test
{
	int a=50;
	public static void get(Test ob)
	{
		ob.a=ob.a+100;
	}
	
}
public class CallByRefrence {
	
	
	
	public static void main(String[] args) {
		Test ob=new Test();
		System.out.println(ob.a);
		Test.get(ob);
		System.out.println(ob.a);
	}

}
