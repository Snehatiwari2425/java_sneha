//java io is used to process input and produce the output.java uses the concept of stream to make i/o operation fast.java i/o package contains
//all classes that is useful for input and output.  Stream:- stream is a collection of the bytes or sequence of data. in java 3 streams are created
//automatically.



package Day2Task;
import java.io.*;

public class JavaInputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("simple message");//standard output stream
		System.out.print("hi");//print
		System.out.printf("%ch",'a');//printf function
		
		
		
		System.err.println("error message");//standard error stream
		
		
		int i=System.in.read();//Standard input stream//it takes the charcater and return the integer value correspond to the charcter
		System.out.println(i);
		
		//system.in.read()   reads a byte at a time.
		

	}

}
