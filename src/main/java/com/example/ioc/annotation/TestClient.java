package com.example.ioc.annotation;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestClient {
	
	@Autowired
	private OrderManager orderManager;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config-annotation.xml");
		
		// Annotation을 사용하여 DI 를 통해 객체를 얻는다.
		OrderManager manager = context.getBean("orderManager", OrderManager.class);
		System.out.println("manager: " + manager);
		
		manager.order();
		
		System.out.println("-------------------------------");
		TestClient testClient = context.getBean("testClient", TestClient.class);
		testClient.orderManager.order();
		System.out.println("-------------------------------");
		
		System.out.println(manager);
		System.out.println(testClient.orderManager);
		System.out.println(context.getBean("orderManager", OrderManager.class));
	}
}
