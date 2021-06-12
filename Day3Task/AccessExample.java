

package Day3Task;

class Text{
	//private int p=20;  //it cannot be accessed outside the class where it is declared
	protected int d=10;
}

public class AccessExample extends Text {

	private int a=10;
	public int b=20;
	protected int c=30;
	
	public static void main(String[] args) {
		
		AccessExample ob=new AccessExample();//main class object is created
		Text ob1=new Text();//text class object is created
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		
		System.out.println(ob1.d);
		//System.out.println(ob.p);

	}

}
