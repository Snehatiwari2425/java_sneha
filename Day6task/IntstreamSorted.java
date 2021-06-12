package Day6task;

import java.util.stream.IntStream;
public class IntstreamSorted 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream stream=IntStream.of(10,3,5,2,9);
		
		stream.sorted().forEach(System.out::println);
		
		System.out.println("after using random number=");
		IntStream str=IntStream.generate(()->(int)(Math.random()*10000)).limit(5);
		
		str.sorted().forEach(System.out::println);

	}

}
