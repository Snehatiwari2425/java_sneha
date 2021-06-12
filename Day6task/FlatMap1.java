//flatmap parameters are IntStream,IntFunction,mapper



package Day6task;

import java.util.stream.IntStream;
public class FlatMap1 {

	public static void main(String[] args) {
	
		
		IntStream stream1=IntStream.of(1,2,3,4,5);
		stream1.flatMap(num->IntStream.of(num*num)).forEach(System.out::println);;

	}

}
