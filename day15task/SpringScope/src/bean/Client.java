package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class  Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("application2.xml");
	
		HelloWord client1= (HelloWord)context.getBean("hw");
		client1.setName("sneha");
		System.out.println("welcome:"+client1.getName());
		
		HelloWord client2= (HelloWord)context.getBean("hw");
		System.out.println("welcome:"+client2.getName());
		
		System.out.println(client1==client2);
		
		System.out.println("addressof the first object="+client1);
		System.out.println("addressof the second object="+client2);

	}

}
