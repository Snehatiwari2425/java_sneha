
//Stream<T> filter(Predicate<?super T>predicate)   this is the syntax of filter

package Day4Task;

import java.util.*;


class Person1
{
	int id;
	String name;
	float income;
	
	public Person1(int id,String name,float income)
	{
		this.id=id;
		this.name=name;
		this.income=income;
	}
}

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person1> l1=new ArrayList<Person1>();
		
		l1.add(new Person1(1,"abc",20000f));
		l1.add(new Person1(2,"bcd",15000f));
		l1.add(new Person1(3,"cde",30000f));
		l1.add(new Person1(4,"def",90000f));

		//filtering by price
		l1.stream()
		.filter(p->p.income>20000)//filter income
		.map(pm->pm.income)//fetching income
		.forEach(System.out::println);//iterating income
	}

}
