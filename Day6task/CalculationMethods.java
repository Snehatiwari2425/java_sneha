package Day6task;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CalculationMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OptionalInt max=IntStream.of(1,34,255,23,6578).max();
		
		System.out.println("max="+max);
		
		OptionalInt min=IntStream.of(1,34,255,23,6578).min();
		
		System.out.println("min="+min);
		
		int sum= IntStream.of(1,34,255,23,6578).sum();
		
		
		System.out.println("sum="+sum);
		

	}

}
