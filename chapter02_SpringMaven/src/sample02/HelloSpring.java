package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Calc bean1 = (Calc) context.getBean("calcAdd");
		bean1.calculate();		
		
		Calc bean2 = (Calc) context.getBean("calcMul");
		bean2.calculate();		
	}
}