//here we will see that we can not directly access the member of grandparent's class it is possible in c++ but
//in java it is not possible in java we can access the member of grandparent's member by using the parents class


package Day3Task;



class GrandParent
{
	public void print()
	{
		System.out.println("this is the class of grandparents");
	}
}
class Parent extends GrandParent
{
	public void print()
	{
		super.print();//super keyword 
		System.out.println("this is the class of parents");
	}
}
class Child extends Parent
{
	public void print()
	{
		//super.super.print();// if we write this to try dirsct access the member of grand parent class so it gives an error
		super.print();
		System.out.println("this is the chid class that extends the parent class");
	}
}



public class inheritance_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.print();

	}

}
