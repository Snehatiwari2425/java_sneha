package Day4Task;

import java.util.*;
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new TreeMap<Integer,String>();
		
		m.put(1, "hello");
		m.put(4, "welcome");
		m.put(2, "value");
		
		System.out.println("before invoking remove method");
		for(Map.Entry <Integer,String> p:m.entrySet())
		{
			System.out.println(p.getKey()+" "+p.getValue());
			
			
		}
		m.remove(2);
		System.out.println("after removing =");
		for(Map.Entry<Integer, String> p:m.entrySet())
		{
			System.out.println(p.getKey()+" "+p.getValue());
		}

	}

}
