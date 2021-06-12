
//for the primitive values into
//a file use it file output stream and for the charcter stream is better to use file writer.

package Day2Task;

import java.io.FileOutputStream;
public class Fileoutput {

	private static FileOutputStream fileOutput;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write one byte
		try 
		{
		  FileOutputStream fout=new FileOutputStream("C:\\Users\\sneha tiwari\\Desktop\\first.txt");
		  fout.write(97);
		  fout.close();
		
		  System.out.println("success");

	    }
	    catch(Exception e)
		{
		   System.out.println(e);
		}
		
		
		//write string
		
		try 
		{
			String s="welcome to internity";
			
			byte[] b=s.getBytes();
			
			fileOutput = new FileOutputStream("C:\\Users\\sneha tiwari\\Desktop\\second.txt");
			fileOutput.write(b);
			
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	

}
