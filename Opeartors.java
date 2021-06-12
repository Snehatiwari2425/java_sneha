

package Day1Task;

public class Opeartors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unary operator  (++,--)
		int a=5;
		System.out.println((a++)+" "+(++a));//increment opeartor
		int b=4;
		System.out.println((b--)+" "+(--b));//decrement
		
		
		//arithmetic opeartor  (+,-,*,/,%)
		int a1=5;
		int b1=4;
		System.out.println(a1+b1);//addition
		System.out.println(a1-b1);//subtraction
		System.out.println(a1*b1);//multiplication
		System.out.println(a1/b1);//divide
		System.out.println(a1%b1);//modulo
		
		//logical opeartor
		int a2=6;
		int b2=6;
		if(a2==6 && b2==6)//logical and(&&,||,!)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not same");
		}
		
		//ternary opeartor (?:)
		
		int min=(a1<b1)?a1:b1;
		System.out.println("minimum between 5 and 4 is="+min);
		
		
		//conditional opeartor  (<,>,<=,>=,==,!=)
		int s1=7;
		int s2=5;
		
		if(s1<s2)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("bye");
		}
		
		//shift operator  (<<,>>,<<<,>>>)
		
		System.out.println(10<<2);

	}

}
