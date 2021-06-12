

package Day2Task;

import java.io.*;

public class BufferInputStreamExample {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		
		System.out.println("enter your name=");
		String name=br.readLine();
		System.out.println(name);

	}

}
