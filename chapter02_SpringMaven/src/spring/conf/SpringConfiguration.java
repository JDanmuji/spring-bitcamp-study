package spring.conf;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample04.SungJukDTO2;

@Configuration
public class SpringConfiguration {

	@Bean
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl("사과"); 
	}
	
	@Bean
	public CalcAdd calcAdd(){
		return new CalcAdd(25, 36); 
	}
	
	@Bean(name="caluMul")
	public CalcMul calcMul(){
		return new CalcMul(); 
	}
	
	
	@Bean
	public ArrayList<SungJukDTO2> arrayList(){
		return new ArrayList<SungJukDTO2>(); 
	}
	
}

// @Bean
//	메소드에서 return 되는 값을 Bean 으로 생성
// 	메소드의 이름은 반드시 bean id 명으로 만들어야 된다.