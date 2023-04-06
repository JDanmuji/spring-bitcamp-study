package sample03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SungJukDTO{
	private String name;
	private int ko;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	
	

	public String getName() {
		return name;
	}

	@Value("홍길동")
	public void setName(String name) {
		this.name = name;
	}

	public int getKo() {
		return ko;
	}

	@Value("97")
	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getEng() {
		return eng;
	}

	@Value("40")
	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	@Value("100")
	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}


	@Override
	public String toString() {
	
		return name + "\t" + ko + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg; 
	}
	
}
