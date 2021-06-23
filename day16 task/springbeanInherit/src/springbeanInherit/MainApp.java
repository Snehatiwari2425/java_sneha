package springbeanInherit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		First f1=(First)context.getBean("hello");
		f1.getMessage1();
		f1.getMessage2();
		
		Second s1=(Second)context.getBean("hellobean");
		s1.getMessage1();
		s1.getMessage2();
		s1.getMessage3();
	}

}
