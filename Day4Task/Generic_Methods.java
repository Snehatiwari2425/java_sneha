//here we will learn about the generic methods


package Day4Task;
public class Generic_Methods {

	public <E> void printArray(E [] s) {  //here we can see that we use <> brcket it is a type of declration the generic method
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		Generic_Methods g1=new Generic_Methods();
		String name[]=new String[] {"abc","def","ghi"};
		Integer number[]= {11,12,13};		
		g1.printArray(name);
		g1.printArray(number);

	}

}
