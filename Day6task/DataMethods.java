package Day6task;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;
public class DataMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//data methods
		
		Comparator<String>  len=(s1,s2)->Integer.compare(s1.length(), s2.length());
		
		Optional<String> max=Stream.of("black","white","yellow","blue").max(len);
		
		 System.out.println("max="+max);  
		
		Optional<String> min=Stream.of("black","white","yellow","blue").min(len);
		
		 System.out.println("min="+min);  
		 
		long count=Stream.of("black","white","yellow","blue").count();//terminal opeartion in data methods
		
	    System.out.println("count="+count);  

	}

}
