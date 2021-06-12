package Day6task;

import java.util.stream.*;
public class NoneMatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream <String> stream=Stream.of("Jav","Dbm","CSE");
		boolean answer=stream.noneMatch(str->str.length()==4);//it gives true because no string has length 4
		System.out.println(answer);
		
		Stream<Integer> stream1=Stream.of(1,2,3,4);
		boolean res=stream1.noneMatch(p->p<0);
		System.out.println(res);
	}

}
