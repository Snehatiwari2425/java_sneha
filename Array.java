package Day1Task;

import java.util.*;
public class Array {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		
		System.out.println("enter the size of an array=");
		int size=sc.nextInt();
		int arr[]=new int[5];
		System.out.println("enter the number in array=");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
	
		//for each loop
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
