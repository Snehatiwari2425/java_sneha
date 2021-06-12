//it stream is used for buffering an ouput stream.it internally uses buffer to store the data.it add more efficiency than to write data directly inot 
//a stream. so it makes the performance fast.
//buffer is a portion in memory


package Day2Task;


import java.io.*;
public class Bufferedoutput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\sneha tiwari\\Desktop\\second.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		
		String s="welcome for meeting";
		byte[] b=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
		
		
		//bufferedInputStream
		FileInputStream fin=new FileInputStream("C:\\Users\\sneha tiwari\\Desktop\\second.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i=0;
				while((i=bin.read())!=-1)
				{
					System.out.print((char)i);
				}
				
				bin.close();
				fin.close();
		
		

	}

}
