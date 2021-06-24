package com.depend.object.inject;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Student st=(Student)context.getBean("hsm");
		st.show();
		
	}

}
