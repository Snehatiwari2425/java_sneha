package Day4Task;

import java.util.*;
public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(101, "abc");
		map.put(103, "def");
		map.put(102,"ghj");
		map.put(100, "klm");
		
		System.out.println("descending map="+map.descendingMap());
		
		System.out.println("headmap="+map.headMap(102,true));//it returns only these key value which is less than or equal to this

		System.out.println("tailmap="+map.tailMap(102,true));
	}

}
