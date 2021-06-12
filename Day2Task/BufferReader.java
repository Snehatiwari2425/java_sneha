
package Day2Task;
import java.io.*;
public class BufferReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//bufferedWriter
		
		FileWriter fw=new FileWriter("file1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		bw.write("hello");
		bw.close();
		fw.close();
		System.out.println("done");
		
		
		//bufferedreader
		
		FileReader fr=new FileReader("file1.txt");
		BufferedReader br=new BufferedReader(fr);
		int i=0;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		br.close();
		fr.close();
		

	}

}
