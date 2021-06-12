//it is basically used for manipulating files and directoriesusing its static methods woks on path object.


package Day2Task;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Filedemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//initialize path object
		Path path=Paths.get("file6.txt");
		
		//check file
		boolean exists=Files.exists(path, new LinkOption[] {LinkOption.NOFOLLOW_LINKS});//linkoption is used to indicate how symbolic
                        //links are handled if the file is a symbolic link.	
		System.out.println(exists);
		
		//read file
		Path path1=Paths.get("C:\\Users\\sneha tiwari\\Desktop\\first.txt");
		try {
			List<String> list=Files.readAllLines(path1);
			System.out.println(list);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		/*
		//delete files
		Path path2=Paths.get("C:\\Users\\sneha tiwari\\Desktop\\t1.txt");
		try {
			Files.delete(path2);
			System.out.println("file has deleted");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		*/
		
		/*
		//move files
		Path source=Paths.get("C:\\Users\\sneha tiwari\\Desktop\\f2.txt");
		Path dest=Paths.get("sne.txt");
		try {
			Files.move(source, dest);
			System.out.println("file has moved");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		*/
		
		/*
		 //copy files
		Path source=Paths.get("C:\\Users\\sneha tiwari\\Desktop\\f2.txt");
		Path dest=Paths.get("sne.txt");
		try {
			Files.move(source, dest);
			System.out.println("file has moved");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		 */
		
		//metdata
		Path path2=Paths.get("second.txt");
		System.out.println(Files.isExecutable(path2));
	
		System.out.println(Files.isReadable(path2));
		
		System.out.println(Files.isWritable(path2));
		
		try
		{
			long z=Files.size(path1);
			System.out.println(z);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
