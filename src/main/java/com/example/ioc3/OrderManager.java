package com.example.ioc3;

public class OrderManager {
	
	// private HyundaiMaker maker;
	// private KiaMaker maker;
	private CarMaker maker;
	
	// bean ����  constructor-arg ����Ͽ� ���� 
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
	
	// bean - init-method attribute ���� �� ȣ��Ǵ� �޼ҵ�
	public void init() {
		System.out.println("OrderManager init");
	}
}
