package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk{
	
	@Autowired
	private SungJukDTO sungJukDTO = null;
	//@Compoent로 생성한 빈들중에서 SungJukDTO를 찾아서 자동으로 값을 얻어오기

	/*
	 * public SungJukImpl(SungJukDTO sungJukDTO) { this.sungJukDTO = sungJukDTO; }
	 */
	
	@Override
	public void calcTot() {
		int total = sungJukDTO.getKo() + sungJukDTO.getEng() +  sungJukDTO.getMath();
		
		sungJukDTO.setTot(total); 
	}

	@Override
	public void calcAvg() {
		double avg = sungJukDTO.getTot()/3;
		
		sungJukDTO.setAvg(avg);
	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 입력 : ");
		int ko = scan.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		int math = scan.nextInt();

		
		sungJukDTO.setName(name);
		sungJukDTO.setKo(ko);
		sungJukDTO.setEng(eng);
		sungJukDTO.setMath(math);
		
		calcTot();
		calcAvg();
	}
	
	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println(sungJukDTO);
						   
		
	}
}
