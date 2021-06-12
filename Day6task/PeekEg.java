package Day6task;

import java.util.*;

public class PeekEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		List<Integer> list=Arrays.asList(1,2,3,4);
		
		list.stream().peek(System.out::println);//using peek without terminal operation code will not produce any output
		

		
		
		

	}

}
