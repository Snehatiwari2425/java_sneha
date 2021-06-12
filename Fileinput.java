package Day2Task;

import java.io.FileInputStream;

public class Fileinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//read a single charcter
		try
		{
			FileInputStream fin=new FileInputStream("C:\\Users\\sneha tiwari\\Desktop\\first.txt");
			int i=fin.read();//read a byte of data from the input stream
			System.out.println((char)i);
			
			fin.close();//close the file
			
		}
		catch(Exception e)
		{
			
		}
		
		//read all the charcter
		try {
			FileInputStream fin1=new FileInputStream("C:\\Users\\sneha tiwari\\Desktop\\second.txt");
			
			//return unique file channel
			System.out.println(fin1.getChannel());
			
			//return the connection to actul file
			System.out.println(fin1.getFD());
			
			//it retruns number of remaining bytes that can be read
			System.out.println(fin1.available());
			
			
			fin1.skip(4);//skips over and discars n bytes of data from the input stream
			System.out.println("file contents are...");
			int i=0;
			while((i=fin1.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
