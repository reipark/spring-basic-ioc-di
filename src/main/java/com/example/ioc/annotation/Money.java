package com.example.ioc.annotation;

// Mutable CLass : ���°��� ����Ǵ� Ŭ����. ���°��� ����Ǵ� Ŭ����. �Ϲ������� �� ������� �ʰ� ����Ѵ�.
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
