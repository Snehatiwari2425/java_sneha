package Day5Task;

import java.util.function.Supplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.DoubleSupplier;

public class Supplier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> s1=()->Math.random();//supplier has no argument it is an functional interface
		System.out.println(s1.get());
		
		
		//primiive version
		
		IntSupplier in=()->Math.abs(2);
		System.out.println(in.getAsInt());
		
		
		DoubleSupplier db=()->Math.random();
		System.out.println(db.getAsDouble());
		
		
		
		LongSupplier ln=()->Math.addExact(5, 7);
		System.out.println(ln.getAsLong());
		
		

		
		

	}

}
