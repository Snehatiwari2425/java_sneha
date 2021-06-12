package Day4Task;


enum Season//outside the class eunm declartion
{
	WINTER,SUMMER,SPRING,FALL
}
public class EnumExample {
	
	public enum WeekDay//inside the class enum declartion
	{
		MONDAY,TUESDAY,WEDENESDY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}

	public static void main(String[] args) {
		
		
		//traverse enum using for each loop
		for(WeekDay w:WeekDay.values())
		{
			System.out.println(w);
		}
		System.out.println("value of monday is="+WeekDay.valueOf("MONDAY"));
		System.out.println("index of thursday="+WeekDay.valueOf("THURSDAY").ordinal());
		
		for(Season s:Season.values())
		{
			System.out.println(s);
		}

	}

}
