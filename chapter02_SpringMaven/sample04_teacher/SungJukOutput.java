package sample04_teacher;

import java.util.List;

import lombok.Setter;

public class SungJukOutput implements SungJuk{
	@Setter
	private List<SungJukDTO2> list= null;

	@Override
	public void execute() {
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for(SungJukDTO2 list : list) {
			System.out.println(list);
		}
		
	}
	
	
}
