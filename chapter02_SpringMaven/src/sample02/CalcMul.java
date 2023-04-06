package sample02;

import org.springframework.beans.factory.annotation.Value;


public class CalcMul implements Calc {
	
	private int x, y ;

	@Value("25")
	public void setX(int x) {
		this.x = x;
	}
	 
	@Value("36")
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void calculate(int x, int y) {
		System.out.println(x + " * " + y + " = " + (x*y));
	}

	@Override
	public void calculate() {
		System.out.println(x + " * " + y + " = " + (x*y));
		
	}
}
