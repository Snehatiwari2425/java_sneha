package Day1Task;

public class StringCheck {
	
	StringCheck(String name)
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hello";
		String s2="hello";
		
		StringCheck s=new StringCheck("welcome");
		StringCheck p=new StringCheck("welcome");
		
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s==p);
		
		

	}

}
