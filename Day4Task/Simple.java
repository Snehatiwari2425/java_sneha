package Day4Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Simple {


	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student>al=new ArrayList<Student>();
		
		al.add(new Student(101,"abc",22));
		al.add(new Student(106,"def",23));
		al.add(new Student(105,"ghi",21));
		
		
		System.out.println("sorting according age=");
		
	
		Collections.sort(al,new AgeComapartor());
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			Student st=(Student)it.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		

	}


}
