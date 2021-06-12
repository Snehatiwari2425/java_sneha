package Day4Task;



public class EnumExample2 {

	
	enum Season
	{
		WINTER(5),SUMMER(10),SPRING(3);
		
		private int value;
		private Season(int value)
		{
			this.value=value;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Season s:Season.values())
		{
			System.out.println(s+" "+s.value);
		}

	}

}
