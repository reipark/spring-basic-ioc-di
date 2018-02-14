package com.example.ioc1;

public class KiaMaker {
	
	public Car sell(Money money) {
		System.out.println("KiaMaker.sell : I get " + money.getAmount());
		
		Car car = new Car("Sonata");
		System.out.println("KiaMaker.sell : I made " + car.getName());
		System.out.println("KiaMaker.sell : I sold " + car.getName());
		
		return car;
	}
}
