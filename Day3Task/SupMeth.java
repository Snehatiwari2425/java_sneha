//here we learn about the super keyword with method
//here we see that overridden concept that's why we use super key for super class

package Day3Task;

public class SupMeth {

	public static void main(String[] args) {
		Bet ob=new Bet();
		ob.disp();
		// TODO Auto-generated method stub

	}

}
class Moth
{
	int a=100;
	void put()
	{
		
		System.out.println("supe class a="+a);
	}
}
class Bet extends Moth
{
	int b=200;
	void put()
	{
		System.out.println("b="+b);
	}
	 void disp()
	 {
		 super.put(); //we will have to write super key because of calling super class 
		 put();
}
}
