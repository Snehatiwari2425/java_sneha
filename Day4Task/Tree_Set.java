//tree set is a class that implements child interface navigableSet .this navigableSet inherited by the sortedSet interface.
//this sortedset is the child interface of
//set interface and this set interface is the child interface of colletion interface
//in tree set elements are in sorted order it does not mean how you store the number it automatic convert into sorting order 
package Day4Task;
import java.util.*;
public class Tree_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeSet<Integer> t1=new TreeSet<Integer>();
       t1.add(5);
       t1.add(7);
       t1.add(9);
       t1.add(3);
       System.out.println(t1);
       System.out.println(t1.first());
       System.out.println(t1.last());
       System.out.println(t1.headSet(9));
       System.out.println(t1.tailSet(9));
       System.out.println(t1.subSet(5,9));
       System.out.println(t1.comparator());
       
	}

}
