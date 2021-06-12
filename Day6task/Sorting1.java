package Day6task;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<String> byLength=(s1,s2)->Integer.compare(s1.length(), s2.length());
		
		//here string sorted according their length
		System.out.println("sorting according length=");
		Stream.of("hello","welcome","internity","foundation").sorted(byLength).forEach(System.out::println);
		
		
		//now we will sort by their alphabate
		System.out.println("sorting according the letters=");
		
		Comparator<String> byLetter=(s1,s2)->s1.compareTo(s2);
		Stream.of("hello","welcome","internity","foundation").sorted(byLetter).forEach(System.out::println);

	}

}
