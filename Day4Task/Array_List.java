//here we will see the array list which is a class that implements List interface  and list interface is the child interface of collection interface


package Day4Task;
import java.util.*;
public class Array_List {

	public static void main(String[] args) {
		
		//creating array list object
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		ArrayList <Character>l1=new ArrayList<Character>();
		l1.add('A');
		l1.add('B');
		l1.add('D');
		l1.add(2,'C');
		
		ArrayList<Character> l3=new ArrayList<Character>();
		l3.add('a');
		l3.add('b');
		l3.add('c');
		
		
		System.out.println("array list are="+l1);
		l1.addAll(1,l3 );
		System.out.println("now array list ="+l1);
		
		System.out.println("now the arraylist="+l2);
	
		//	l1.clear();//it clear all the elemnts from the array
		//System.out.println("now use clear method so="+l1);
		
		l1.clone();  //it return copy of object
		System.out.println("now use clone method so now what it do="+l1);
		
		System.out.println("contains mehod check given element is present or not="+l1.contains('B'));
		
		System.out.println("we pass index now the elemnt of that index is="+l1.get(5));
		System.out.println("the index of given element="+l1.indexOf('D'));
		System.out.println("remove elemnt from the given index="+l1.remove(5));
    	l1.trimToSize();
		
	
	
		

	}

}
