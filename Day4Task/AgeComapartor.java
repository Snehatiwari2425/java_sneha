package Day4Task;

import java.util.*;
public class AgeComapartor implements Comparator<Object>{
	
	
public int compare(Object ob1,Object ob2)
{
	Student s1=(Student)ob1;
	Student s2=(Student) ob2;
	
	if(s1.age==s2.age)
		return 0;
	
	else if(s1.age<s2.age)
		return 1;
	
	else
		return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
