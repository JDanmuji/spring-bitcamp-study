package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageBean bean1 = (MessageBean) context.getBean("messageBean"); //부모  = 자식
		bean1.sayHello("Spring1");
		
		MessageBean bean2 = (MessageBean) context.getBean("messageBean", MessageBean.class); //부모  = 자식
		bean2.sayHello("Spring2");
		
		MessageBean bean3 = (MessageBean) context.getBean("messageBean"); //부모  = 자식
		bean3.sayHello("Spring3");
		
		
	}
}