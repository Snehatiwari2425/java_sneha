package Day1Task;
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive data type
		int a=10;  //size 4 byte
		float b=20.5f;  //size 4 byte
		double c=20.3; //size 8 byte
		long d=2000000000; //size 8 byte
		char e='A'; //size 2 bye
		byte f=5; //size 1 byte
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		
		//widening
		byte a1=2;
		int b1=a1;
		System.out.println(a1+" "+b1);
		
		//type casting
		float f1=20.5f;
		int b2=(int)f1;
		System.out.println(f1+" "+b2);
		
		//wrapper class
		int b3=10;
		Integer i1=b3;
		System.out.println(i1);
		
		@SuppressWarnings("deprecation")//it means this features are going to be removed
		Integer i2=new Integer(5);
		System.out.println(i2);
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		

	}

}
