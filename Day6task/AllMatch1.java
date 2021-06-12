
package Day6task;

import java.util.Arrays;
import java.util.List;

public class AllMatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(4,2,3,5);
		
		Boolean result=list.stream().allMatch(p->(p*3)%3==0);//all match means all element follow apply rule
		System.out.println(result);
		

	}

}
