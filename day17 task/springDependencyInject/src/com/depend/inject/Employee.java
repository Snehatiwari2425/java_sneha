package com.depend.inject;

public class Employee {

	private int id;
	private String name;
	
	public Employee()
	{
		System.out.println("default constructor");
	}
	
	public Employee(int id)
	{
		this.id=id;
	}
	public Employee(String name)
	{
		this.name=name;
	}
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void show()
	{
		System.out.println("id="+id+" "+"name="+name);
	}
}
