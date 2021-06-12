package Day6task;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAny1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4);
		
		Optional<Integer> answer=list.stream().findAny();
		
		if(answer.isPresent())
		{
			System.out.println(answer.get());
		}
		else
			System.out.println("no value");

		
		//find any method  to return the elements divisible by 4
		
		IntStream stream=IntStream.of(1,2,3,4,5,6).parallel();
		
		stream=stream.filter(num->num%4==0);
		
       OptionalInt result=stream.findAny();
       if(answer.isPresent())
    	   System.out.println(result.getAsInt());
       else
    	   System.out.println("no value");
		
		
	}

}
