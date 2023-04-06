package sample04_teacher;

import java.util.List;

import lombok.Setter;
import sample04.SungJukDTO2;

public class SungJukDelete implements SungJuk{
	@Setter
	private List<SungJukDTO2> list= null;

	@Override
	public void execute() {
		System.out.print("이름 입력 :");
		String name = scan.next();
	
		

		for(SungJukDTO2 list : sungJukList) {
			System.out.println(list);
		}
	}



	
}
