package sample04;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class HelloSpring {
	
	
	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		meun(context);
		
		System.out.println("프로그램을 종료합니다.");
	
	}
	
	public  static void meun(ApplicationContext context) {
		int num;
		SungJuk bean = null;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("*********************************");
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.끝");
			System.out.println("*********************************");
			
			num = scan.nextInt();
			
			if (num  == 5) {
				break;
			}			
			
			if (num == 1) {
				bean = (SungJuk) context.getBean("sungJukInput");
			} else if (num == 2) {
				bean = (SungJuk) context.getBean("sungJukOutput");
			} else if (num == 3) {
				bean = (SungJuk) context.getBean("sungJukDelete");
			} else if (num == 4) {
				bean = (SungJuk) context.getBean("sungJukUpdate");
			}
			
			   
			
			bean.execute();
			
			
		}
	
		

	}
}