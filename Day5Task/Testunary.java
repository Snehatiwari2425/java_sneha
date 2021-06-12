package Day5Task;

import java.util.function.UnaryOperator;
import java.util.function.Function;

public class Testunary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<Integer> unary=v->v*10;
		
		Function<Integer,Integer> function =f->f*10;
		
		System.out.println(unary.apply(10));
		System.out.println(function.apply(10));

	}

}
