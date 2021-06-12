//herierchichal inheritance

package Day3Task;

public class Herierichal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Son ob=new Son();
   Daughter obj=new Daughter();
   ob.getdata(4, 6);
   ob.disp();
   obj.getdata(5, 5);
   obj.display();
	}

}
class Father  //super class
{
	int a,b;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
}
class Son extends Father  //derived class or new class
{
	int add()
	{
		int sum=a+b;
		return sum;
	}
	void disp()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("sum="+add());
	}
}
class Daughter extends Father
{
	int multi()
	{
		int mul=(a*b);
		return mul;
	}
	void display()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("multiple="+multi());
	}
}

