package Day6task;

//maptolong returns longstream

import java.util.*;
public class MapLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("the stream after applying the function=");
		
		List<String> list=Arrays.asList("654","225","33","421","52'");
		
		list.stream().mapToLong(num->Long.parseLong(num))
		.filter(num->Math.sqrt(num)/5==3)
		.forEach(System.out::println);
		

	}

}
