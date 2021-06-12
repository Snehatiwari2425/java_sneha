//this is used to write common data in multiple file.it hold the copy of data and send i to the multiple streams.

package Day2Task;


import java.io.*;
public class ByteArrayoutput {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fout1=new FileOutputStream("C:\\Users\\sneha tiwari\\Desktop\\f1.txt");
		FileOutputStream fout2=new FileOutputStream("C:\\Users\\sneha tiwari\\Desktop\\f2.txt");
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		
		bout.write(98);
		
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		
		bout.flush();
		bout.close();
		
		System.out.println("success");
		
		
		//byteArrayInputStream
		
		byte[] b= {97,98,99,100};
		
		ByteArrayInputStream bin=new ByteArrayInputStream(b);
		
		int k=0;
		while((k=bin.read())!=-1)
		{
			char ch=(char)k;
			System.out.println("ascii value of charcter is="+k+"and the charcter is="+ch);
		}

	}

}
