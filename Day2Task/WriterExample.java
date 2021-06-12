
package Day2Task;

import java.io.*;
public class WriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//filewriter  it direct write string no need to convert in byte array
		Writer w=new FileWriter("file1.txt");
		String s="welcome";
		w.write(s);
		w.close();
		System.out.println("done");
		
		//filereader  it return the data in byte form like fileinput stream
		Reader r=new FileReader("file1.txt");
		int data=r.read();
		while(data!=-1)
		{
			System.out.print((char)data);
			data=r.read();
		}
		r.close();

	}

}
