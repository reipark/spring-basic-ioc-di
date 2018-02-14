package com.example.ioc.annotation;

import org.springframework.stereotype.Component;

/**
 * <bean id="kia" class="com.example.ioc.annotation.KiaMaker" />
 */
@Component("kia")
public class KiaMaker implements CarMaker {
	
	public Car sell(Money money) {
		System.out.println("KiaMaker.sell : I get " + money.getAmount());
		
		Car car = new Car("K5");
		System.out.println("KiaMaker.sell : I made " + car.getName());
		System.out.println("KiaMaker.sell : I sold " + car.getName());
		
		return car;
	}
}
