package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class HelloSpring {
	static String name;
	static int ko;
	static int eng ;
	static int math;
	
	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
		SungJuk bean = (SungJuk) context.getBean("sungJukImpl");
		bean.calcTot();
		bean.calcAvg();
		bean.display();
		
		
		bean.modify();
		bean.display();
	
		
	}
	
	
}