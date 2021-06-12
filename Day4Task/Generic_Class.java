//here we will learn how to decalare the generic class


package Day4Task;
class Mydata<T>{
	T i;
	public void add(T i1) {
		i=i1;
	}
	public T get() {
		return(i);
	}
}
public class Generic_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mydata<Integer> m1=new Mydata<Integer>();
		Mydata<String> m2=new Mydata<String>();
		m1.add(5);
		m2.add("sneha");
		
		System.out.println("m1="+m1.get()+"\nm2="+m2.get());
	}

}
