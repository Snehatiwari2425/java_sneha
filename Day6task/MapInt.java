package Day6task;

//maptoint returns intstream

import java.util.Arrays;
import java.util.List;
public class MapInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("1","2","3","4");//string to int map
		
		list.stream().mapToInt(num->Integer.parseInt(num))
		.filter(p->p%3==0)
		.forEach(System.out::println);

	}

}
