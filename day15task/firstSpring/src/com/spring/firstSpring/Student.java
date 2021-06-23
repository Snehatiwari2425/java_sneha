package com.spring.firstSpring;

public class Student {
	
	public  String name;
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return  name;
	}
	
	public void display()
	{
		System.out.println("welcome:"+name);
	}

}
