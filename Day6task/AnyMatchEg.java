package Day6task;
import java.util.*;
import java.util.stream.*;

public class AnyMatchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(2,3,4,5);
		
		boolean result=list.stream().anyMatch(p-> (p*(p+1))/4==5);
				
				System.out.println(result);
		
				
				//second way  check uppercase
				
				Stream <String>stream1=Stream.of("Hello","Welcome","Internity");
				
				boolean res=stream1.anyMatch(str->Character.isUpperCase(str.charAt(0)));
				
				System.out.println(res);
		

	}

}
