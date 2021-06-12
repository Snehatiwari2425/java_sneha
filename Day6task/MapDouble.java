package Day6task;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	List<String> list=Arrays.asList("1","2","3","4");
	
	Stream<String> stream=list.stream();
	
	stream.mapToDouble(num->Double.parseDouble(num)).filter(p->p*3>10).forEach(System.out::println);
	
		
		
		
		

	}

}
