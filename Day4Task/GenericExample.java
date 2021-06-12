
//advantage of generic

package Day4Task;
import java.util.*;
public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//without generic  lack type safety
		List list=new ArrayList();
		
	//	list.add(10);
		list.add("abc");
		
		String s=(String)list.get(0);  //type casting before generic
		System.out.println(list);
		System.out.println(s);
		
		
		//with generic
		
		List<Integer> list1=new ArrayList<Integer>();//type safety 
		list1.add(10);
		//list1.add("abc");  compile time error
		list1.add(20);
		System.out.println(list1);
		
		
		//there is no need of type casting using generic
		
		int a=list1.get(0);
		System.out.println(a);
		
		
		

	}

}
