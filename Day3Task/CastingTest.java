

package Day3Task;

class Perk{
	
	void show()
	{
		System.out.println("perk class");
	}
	
}

public class CastingTest extends Perk {



	public static void main(String[] args) {
		
		CastingTest t=new CastingTest();
		Perk ob=new Perk();
		
		ob=(Perk)t;//casting
		ob.show();

	}

}
