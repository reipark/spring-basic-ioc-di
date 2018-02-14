package com.example.ioc3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		/*CarMaker maker = new HyundaiMaker();
		
		OrderManager manager = new OrderManager();
		manager.setMaker(maker);
		manager.order();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config.xml");
		OrderManager manager = context.getBean("manager", OrderManager.class);
		// OrderManager manager = (OrderManager) context.getBean("manage");
		System.out.println("manager: " + manager);
		manager.order();
		
	}
}
