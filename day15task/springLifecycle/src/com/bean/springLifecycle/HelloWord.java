package com.bean.springLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWord implements InitializingBean,DisposableBean {
	
	public void afterPropertiesSet()throws Exception
	{
		System.out.println("bean helloword has beaan instanitated and i am the init() method");
	}
	
	public void destroy() throws Exception
	{
		System.out.println("container has been closed"+"and I am the destroy()method");
	}

}
