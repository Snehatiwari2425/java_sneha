
//stream pipeline flow

package Day6task;

import java.util.*;
import java.util.stream.*;
public class Stream1 {

	

	public static void main(String[] args) {
		
		//create a list of integer
		// 1.source of data
		List<Integer> number= Arrays.asList(2,3,4,5);
		
		// 2.create/convert source of data into a stream 
		
		Stream<Integer> instream = number.stream();
		
		// 3. intermediate opeartions
		
		Stream<Integer> computedStream=instream.map(p-> p*p);//map method 
		
		// 5. terminal opeartion
		
		computedStream.forEach(a->System.out.println(a));
		
		

	}

}
