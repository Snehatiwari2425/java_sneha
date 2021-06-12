//path is the particular location of an entity such as file or a directory in a file system.path is an interface which is introduced in 
//java NIO in jdk 7.



package Day2Task;

import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Path relative=Paths.get("file2.txt");//in order to get the instance of path we can use get method
		System.out.println("relative path="+relative);
		Path absolute=relative.toAbsolutePath();
		System.out.println("absolute path="+absolute);
		
		Path path=Paths.get("c:\\Users\\sneha tiwari\\Dekstop\\two.txt");
		FileSystem fs=path.getFileSystem();
		
		System.out.println(fs.toString());
		System.out.println(path.isAbsolute());//check path is absolute or not
		System.out.println(path.getFileName());//return file name
		System.out.println(path.toAbsolutePath().toString());
		System.out.println(path.getName(0));//return a name element of this path
		System.out.println(path.getRoot());//return root name
		System.out.println(path.getParent());//return parent
		System.out.println(path.subpath(0, 2));//return sub path
		System.out.println(path.getNameCount());
		

	}

}
