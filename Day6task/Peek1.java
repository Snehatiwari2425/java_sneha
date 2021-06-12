package Day6task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Peek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4);
		
		Stream<Integer> stream=list.stream();
		
		//peek with terminal opeartion
		stream.filter(e->(e*3)%3==0).peek(e->System.out.println(e)).collect( Collectors.toList());
		
		

	}

}
