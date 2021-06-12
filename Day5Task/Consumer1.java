package Day5Task;



import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.BiConsumer;

public class Consumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> con=t->System.out.println(t);//consumer is an operation take some input return no output
		
		con.accept("hi");
		
		
		Consumer<String> first=t->System.out.println("first:="+t);
		Consumer<String> last=t->System.out.println("last:="+t);
		
		first.andThen(last).accept("welcome");
		
		
		
		//primitive functional interface
		IntConsumer in=t->System.out.println(t);
		in.accept(2);
		
		
		
		//longConsumer
		LongConsumer ln=t->System.out.println(t);
		ln.accept(3);
		
		
		
		//DoubleConsumer
		DoubleConsumer db=t->System.out.println(t);
		db.accept(120);
		
		//binary version of consumer
		
		BiConsumer<String,String> bicon=(t,v)->System.out.println(t+" "+v);
		bicon.accept("welcome", "internity");
		

	}

}
