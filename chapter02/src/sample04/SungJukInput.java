package sample04;

import java.util.ArrayList;

public class SungJukInput implements SungJuk{
	private SungJukDTO2 sungJukDTO2 = new SungJukDTO2();
	private ArrayList<SungJukDTO2> sungJukList = null;
	
	public SungJukInput(ArrayList<SungJukDTO2> sungJukList) {
		this.sungJukList = sungJukList;
		
	}


	@Override
	public void execute() {
		
		System.out.print("이름 입력 : ");
		sungJukDTO2.setName(scan.next());
		
		System.out.print("국어 점수 입력 : ");
		sungJukDTO2.setKo(scan.nextInt());
		System.out.print("영어 점수 입력 : ");
		sungJukDTO2.setEng(scan.nextInt());
		System.out.print("수학 점수 입력 : ");
		sungJukDTO2.setMath(scan.nextInt());
		
		sungJukDTO2.setTot(sungJukDTO2.getKo()+sungJukDTO2.getEng()+sungJukDTO2.getMath());
		sungJukDTO2.setAvg((double)sungJukDTO2.getTot()/3);
		
		sungJukList.add(sungJukDTO2);
		
		System.out.println(sungJukDTO2.getName() + " 님의 데이터를 입력했습니다.");
	}

	
}
