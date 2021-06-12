package Day4Task;


import java.util.*;
import java.util.stream.Stream;

class product
{
	int id;
	String name;
	float price;
	
	product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class FilterLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<product> list=new ArrayList<product>();
		
		list.add(new product(1,"mobile",20000f));
		list.add(new product(2,"laptop",50000f));
		list.add(new product(3,"car",200000f));
		list.add(new product(4,"bike",90000f));
		
		Stream<product> s1=list.stream().filter(p->p.price>20000f);//filter data by using lambda
		
	s1.forEach(product->System.out.println(product.name+":"+product.price));	//iterate through by using lambda
	
	}

}
