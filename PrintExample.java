package Day2Task;

import java.io.*;

public class PrintExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//data to write on console using printWriter
		PrintWriter pr=new PrintWriter(System.out);
		pr.write("welcome interntiy");
		pr.flush();
		pr.close();
		
		//data to write on the file
		PrintWriter pr1=new PrintWriter("file2.txt");
		pr1.write("hello");
		pr1.flush();
		pr1.close();
		
		

	}

}
