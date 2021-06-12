package Day1Task;

public class Objectrefer {
	
	private static Objectrefer ob1;

	Objectrefer(String name)
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setOb1(new Objectrefer("hello"));
		Objectrefer ob2=new Objectrefer("welcome");
		
		setOb1(ob2);//dereference
		setOb1(null);
		//System.gc();
		
		
		

	}

	public static Objectrefer getOb1() {
		return ob1;
	}

	public static void setOb1(Objectrefer ob1) {
		Objectrefer.ob1 = ob1;
	}

}
