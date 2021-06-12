package Day4Task;


interface  Test{
	
	public void show();
	
	
}
interface Test1{
	public String getName(String name);
}
public class Lambda1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=20;
		
		
		//lambda expression
		Test t=()->{  //without paramter
			System.out.println("width="+width);
		};
		
		t.show();
		
		Test1 t1=(name)->{  //with paramter
			return name;
			
		};
		System.out.println(t1.getName("sneha"));

	}

}
