package Day6task;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFirst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream list=IntStream.of(5,2,3,4,1).parallel();
		
		OptionalInt answer=list.findFirst();
		
		if(answer.isPresent())
			System.out.println(answer.getAsInt());
		else
			System.out.println("no value");

		//string stream
		
		List<String> str=Arrays.asList("abc","def","ghi");
		
		Stream<String> stream=str.stream();
		
		Optional<String> result=stream.findFirst();
		
		if(result.isPresent())
			System.out.println(result.get());
		else
			System.out.println("no value");
			
	}

}
