package sample01;

import org.springframework.beans.factory.annotation.Value;


public class MessageBeanImpl implements MessageBean {

	private String fruit;
	private int cost, qty;

	
	
	public MessageBeanImpl(@Value("사과")  String fruit) {
		super();
		this.fruit = fruit;
	}

	@Override
	public void sayHello() {
		System.out.println(fruit + "\t" + cost + "\t" + qty);

	}


	 @Value("5000")
	public void setCost( int cost) {
		this.cost = cost;
	}
	
	@Value("3")
	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public void sayHello(String fruit, int cost) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);

	}

	@Override
	public void sayHello(String name, int cost, int qty) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
	}

}
