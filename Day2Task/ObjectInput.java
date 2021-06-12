package Day2Task;


import java.io.*;
public class ObjectInput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//write data using objectoutputstream
		int data1=5;
		String data2="welcome";
		FileOutputStream fout=new FileOutputStream("C:\\Users\\sneha tiwari\\Desktop\\t1.txt");
		ObjectOutputStream oas=new ObjectOutputStream(fout);
		oas.writeInt(data1);
		oas.writeObject(data2);
		//oas.writeObjet(new Date());
		
		//read data using objectinputstream
		
		FileInputStream fin=new FileInputStream("C:\\Users\\sneha tiwari\\Desktop\\t1.txt");
		ObjectInputStream os=new ObjectInputStream(fin);
		
		System.out.println("integer data:"+os.readInt());
		System.out.println("string data:"+os.readObject());
		
		oas.close();
		os.close();

	}

}
