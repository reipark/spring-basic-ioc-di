package com.example.ioc2;

public class OrderManager {
	
	// private HyundaiMaker maker;
	// private KiaMaker maker;
	private CarMaker maker;
	
	public OrderManager() {
		// maker = new HyundaiMaker();
		maker = new KiaMaker();
	}
	
	public void order() {
		Money money = new Money(1000);
		System.out.println("OrerManager.order : I made " + money.getAmount());

		System.out.println("OrerManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrerManager.order : I recieved " + money.getAmount());
	}
}
