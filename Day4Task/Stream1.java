


package Day4Task;

import java.util.*;
import java.util.stream.Stream;

public class Stream1 {

	
	public static <T> void getList(List<T> list)
	{
		Stream<T> stream=list.stream();//creating stream object
		
		Iterator<T> it=stream.iterator(); //iterator object
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<Integer>();//source code
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		getList(list);

	}

}
