package com.inject.innerbean;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		TestEdit obj=(TestEdit)context.getBean("textEdit");
		obj.spellCheck();

	}

}
