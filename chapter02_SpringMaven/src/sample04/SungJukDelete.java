package sample04;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SungJukDelete implements SungJuk{
	
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list= null;

	@Override
	public void execute() {
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("삭제 할 이름 입력 : ");
		String name_find =  scanner.next();
		
		Iterator<SungJukDTO2> it = list.iterator();
		
		int sw = 0;
				
		while(it.hasNext()) { 
			
			SungJukDTO2 sungJukDTO2 = it.next();
			
			if(sungJukDTO2.getName().equals(name_find)) {
				sw=1;
				it.remove();
				System.out.println( name_find + " 님이 삭제되었습니다.");
				break;
				
			}
			
			
		}
		
		if(sw == 0) {
			System.out.println("찾고자하는 이름이 없습니다.");
		}
	}



	
}
