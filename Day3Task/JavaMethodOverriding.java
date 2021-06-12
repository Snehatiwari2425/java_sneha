
package Day3Task;

class Sports{
	String getName()
	{
		return "genric";
	}
	 void getNumberOfTeamMembers(){
	        System.out.println( "Each team has n players in " + getName() );
	    }
	}

	class Soccer extends Sports{
	  
	    String getName(){
	        return "Soccer Class";
	    }
	    

	    // Write your overridden getNumberOfTeamMembers method here
	    void getNumberOfTeamMemebers(){
	        
	        System.out.println("Each team has 11 players in "+getName());
	    }

	}



public class JavaMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports s=new Sports();
		Soccer c=new Soccer();
		System.out.println(s.getName());
		s.getNumberOfTeamMembers();
		System.out.println(c.getName());
		c.getNumberOfTeamMemebers();
		
		

	}

}
