package com.bean.springLifecycle;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bean.springLifecycle.HelloWord;
public class Driver {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cfg=new ClassPathXmlApplicationContext("spring.xml");
		
		cfg.close();
		
		

	}

}
