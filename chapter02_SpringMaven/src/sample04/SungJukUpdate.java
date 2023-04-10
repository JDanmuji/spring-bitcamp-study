package sample04;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SungJukUpdate implements SungJuk{
	
	@Autowired
	private SungJukDTO2 sungJukDTO2 = null;
	@Autowired
	private List<SungJukDTO2> list= null;

	@Override
	public void execute() {
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수정 할 이름 입력 : ");
		
		String name_find =  scanner.next();
		
		int sw = 0;
		for(SungJukDTO2 sungJukDTO2 :  list) {
			
			if(sungJukDTO2.getName().equals(name_find)) {
				sw = 1;
				
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO2);
				
				System.out.print("이름 입력 : ");
				String name = scan.next();
				
				System.out.print("국어 점수 입력 : ");
				int ko = scan.nextInt();
				System.out.print("영어 점수 입력 : ");
				int eng = scan.nextInt();
				System.out.print("수학 점수 입력 : ");
				int math = scan.nextInt();
				
				int total = ko + eng + math;
				double avg = (double) total/3;
				
				sungJukDTO2.setName(name);
				sungJukDTO2.setKo(ko);
				sungJukDTO2.setEng(eng);
				sungJukDTO2.setMath(math);
				sungJukDTO2.setTot(total);
				sungJukDTO2.setAvg(avg);
				
				System.out.println(name + " 님의 데이터를 수정하였습니다.");
				
				break;
			}
		}
		
		if(sw == 0) {
			System.out.println("찾고자하는 이름이 없습니다.");
		}
	}
	

}
