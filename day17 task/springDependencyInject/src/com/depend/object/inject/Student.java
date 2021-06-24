package com.depend.object.inject;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	
	public Student()
	{
		
	}
	public Student(int id,String name,Address address)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void show()
	{
		System.out.println("id="+id+"\tname="+name);
		System.out.println(address.toString());
	}

}
