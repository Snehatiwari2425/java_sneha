package Day4Task;


import java.util.*;
public class ArrayDequeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d1=new ArrayDeque<String>();
		Deque<Integer> d2=new ArrayDeque<Integer>();
		
		d1.add("sneha");
		d1.addLast("mansi");
		d1.addLast("hello");
		d1.addFirst("shreya");
		
		for(String s:d1)
		{
			System.out.println(s);
		}
		
		
		d2.offer(5);
		d2.offer(7);
		d2.add(9);
		d2.offerFirst(1);
		d2.offerLast(10);
		
		
		
		Iterator<Integer> it=d2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	

	}

}
