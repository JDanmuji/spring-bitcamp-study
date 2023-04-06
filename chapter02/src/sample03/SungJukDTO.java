package sample03;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class SungJukDTO{
	private String name;
	private int ko;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	

	
	@Override
	public String toString() {
		return name + "\t" + ko + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg; 
	}
	
}
