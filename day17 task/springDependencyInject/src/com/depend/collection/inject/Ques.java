package com.depend.collection.inject;

import java.util.*;
import java.util.Iterator;

public class Ques {
	
	private List<String> answers;
	private String ques;
	
	public Ques() {}
	
	public Ques(String ques,List<String> answers)
	{
		this.ques=ques;
		this.answers=answers;
	}
	
	public void disp()
	{
		System.out.println("the question is="+ques);
		System.out.println("anserws are:");
		Iterator<String> itr=answers.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
