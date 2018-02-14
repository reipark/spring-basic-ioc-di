package com.example.ioc.annotation;

import org.springframework.stereotype.Component;

/**
 * <bean id="hyundai" class="com.example.ioc.annotation.HyundaiMaker" />
 */
@Component("hyundai")
public class HyundaiMaker implements CarMaker {
	
	public Car sell(Money money) {
		System.out.println("HyundaiMaker.sell : I get " + money.getAmount());
		
		Car car = new Car("Sonata");
		System.out.println("HyundaiMaker.sell : I made " + car.getName());
		System.out.println("HyundaiMaker.sell : I sold " + car.getName());
		
		return car;
	}
}
