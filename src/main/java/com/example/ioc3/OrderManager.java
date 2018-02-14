package com.example.ioc3;

public class OrderManager {
	
	// private HyundaiMaker maker;
	// private KiaMaker maker;
	private CarMaker maker;
	
	// bean 에서  constructor-arg 사용하여 가능 
	/*public OrderManager(CarMaker maker) { 
		this.maker = maker; 
	}*/
	
	public void order() {
		Money money = new Money(1000);
		System.out.println("OrerManager.order : I made " + money.getAmount());

		System.out.println("OrerManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrerManager.order : I recieved " + money.getAmount());
	}
	
	public void setMaker(CarMaker maker) {
		this.maker = maker;
	}
	
	// bean - init-method attribute 설정 시 호출되는 메소드
	public void init() {
		System.out.println("OrderManager init");
	}
}
