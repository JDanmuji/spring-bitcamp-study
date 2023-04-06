package sample02;

import org.springframework.beans.factory.annotation.Value;




public class CalcAdd implements Calc{
	private int x;
	private int y;
	
	
	public CalcAdd(@Value("25")int x, @Value("36")int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void calculate(int x, int y) {
		System.out.println(x + " + " +  y + " = " + (x+y));	
	}

	@Override
	public void calculate() {
		System.out.println(x + " + " +  y + " = " + (x+y));	
		
	}

}
