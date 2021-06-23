package driver;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import driver.Hello;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("newspring.xml");
		
		Hello client1= (Hello)context.getBean("hs");
		client1.setName("sneha");
		System.out.println("welcome:"+client1.getName());
		
		Hello client2= (Hello)context.getBean("hs");
		client2.setName("sneha");
		System.out.println("welcome:"+client2.getName());
		
		System.out.println(client1==client2);
		
		System.out.println("addressof the first object="+client1);
		System.out.println("addressof the second object="+client2);


	}

}
