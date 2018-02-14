package com.example.ioc.annotation;

// Mutable CLass : 상태값이 변경되는 클래스. 상태값이 변경되는 클래스. 일반적으로 빈에 등록하지 않고 사용한다.
public class Money {
	
	private int amount;
	
	public Money() {}
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
