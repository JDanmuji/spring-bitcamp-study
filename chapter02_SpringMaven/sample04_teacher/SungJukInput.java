package sample04_teacher;

import java.util.List;

import lombok.Setter;

public class SungJukInput implements SungJuk{
	
	@Setter
	private SungJukDTO2 sungJukDTO2 = null;
	@Setter
	private List<SungJukDTO2> list= null;

	


	@Override
	public void execute() {
		
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
		
		list.add(sungJukDTO2);
		
		System.out.println(name + " data save!");
	}



	
}
