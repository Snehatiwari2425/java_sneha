package com.depend.collection.inject;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Answer.xml");
		Ques  obj=(Ques)context.getBean("q");
		obj.disp();
		

	}

}
