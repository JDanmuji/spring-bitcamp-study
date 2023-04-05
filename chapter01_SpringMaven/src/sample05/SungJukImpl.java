package sample05;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sungJukImpl")
@Scope("prototype")
public class SungJukImpl implements SungJuk{
	private String name;
	private int ko;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	

	public SungJukImpl(String name, int ko, int eng, int math) {
		this.name = name;
		this.ko = ko;
		this.eng = eng;
		this.math = math;
	
	}

	@Override
	public void calc() {
		tot = ko + eng + math;
		avg = (double) tot/3;
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println(name + "\t" + ko + "\t" + eng + "\t"+ math + "\t" + tot + "\t" + avg);
		
	}
}
