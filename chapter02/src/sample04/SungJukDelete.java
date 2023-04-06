package sample04;

import java.util.ArrayList;

public class SungJukDelete implements SungJuk{
	private SungJukDTO2 sungJukDTO2 = null;
	private ArrayList<SungJukDTO2> sungJukList = null;

	public SungJukDelete(ArrayList<SungJukDTO2> sungJukList) {
		this.sungJukList = sungJukList;
	}
	
	@Override
	public void execute() {
		System.out.print("이름 입력 :");
		String name = scan.next();
		System.out.print("국어점수 입력 :");
		int ko = scan.nextInt();
		System.out.print("영어점수 입력 :");
		int eng = scan.nextInt();
		System.out.print("수학점수 입력 :");
		int math = scan.nextInt();
		
		
		
	}



	
}
