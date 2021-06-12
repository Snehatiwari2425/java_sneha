
//function is an operation that takes an input argument of a certain type and give result of another type
//function is an functional interface

package Day5Task;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.DoubleFunction;
import java.util.function.BiFunction;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Function<String,String> f=t->t.toUpperCase();
		
		System.out.println(f.apply("abcd"));
		
		try {
		f.compose(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception thrown while passing null");
		}
		
		
		//primitive version
		
		IntFunction in=t->t*5;
		System.out.println(in.apply(5));
		
		
		//LongFunction
		
		LongFunction ln=t->t*10L;
		System.out.println(ln.apply(4L));
		
		
		//DoubleFunction
		
		DoubleFunction db=t->t/2.0;
		System.out.println(db.apply(4.0));
		
		
		//binary version of function
		BiFunction<Integer,Integer,Integer> bifunc=(t,v)->t*v;
		System.out.println(bifunc.apply(5,4));
	}
}