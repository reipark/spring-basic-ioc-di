package com.example.ioc3;

public class HyundaiMaker implements CarMaker {
	
	public Car sell(Money money) {
		System.out.println("HyundaiMaker.sell : I get " + money.getAmount());
		
		Car car = new Car("Sonata");
		System.out.println("HyundaiMaker.sell : I made " + car.getName());
		System.out.println("HyundaiMaker.sell : I sold " + car.getName());
		
		return car;
	}
}
