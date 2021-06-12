package Day5Task;

import java.util.function.Predicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.DoublePredicate;
import java.util.function.BiPredicate;
public class Predicate1 {

	public static void main(String[] args) {
		
		Predicate<Integer> pmp=t->t%2==0;//predicate is a statement that may be true or false depending on value of its variables
		
		boolean result=pmp.test(4);
		System.out.println(result);
		
		
		
		//primitive versions  of functional interface
		IntPredicate in=t->t*2>10;//lambda expression for implementing interface 
		System.out.println(in.test(5));
		
		System.out.println(in.negate());
		
		   
		
		//LongPredicate
		LongPredicate ln=t->t*2>10;
		ln.and(t->t%2==0);
		System.out.println(ln.test(6));
		
		
		//DoublePredicate
		DoublePredicate db=t->(t*5)%4==0;
		db.and(t->t%2==0);//and method to add new predicate
		System.out.println(db.test(4));
		
		
		//binary version of predicate
		BiPredicate<Integer,Integer> bin=(t,v)->t>v;//it takes two argument
		System.out.println(bin.test(5, 4));
		
		
		
		

	}

}
