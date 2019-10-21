package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.BeanOne;
import bean.BeanTwo;

public class Client {
	
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"resources/spring.xml");
		BeanOne obj1 = context.getBean(BeanOne.class);
		BeanTwo obj2 = context.getBean(BeanTwo.class);

		obj1.send("Hi ");
		obj2.send("hello");

		// close the context
		context.close();
	}

}
