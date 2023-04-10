package sample04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class SungJukOutput implements SungJuk{
	
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> sungJukList = null;

	public SungJukOutput(ArrayList<SungJukDTO2> sungJukList) {
		this.sungJukList = sungJukList;
	}

	


	@Override
	public void execute() {
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		for(SungJukDTO2 list : sungJukList) {
			System.out.println(list);
		}
		
	}
	
	
}
