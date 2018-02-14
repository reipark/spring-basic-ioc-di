package com.example.ioc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//Ŭ������ �뵵�� �����ϱ� ���� �ϱ� ���ؼ� @Component�� Ȯ���ؼ� ���ο� ������̼��� �������.
@Service // id �� �������� ������ Ŭ���� �̸��� id�� ����Ѵ�. �� id �� �ҹ��ڷ� �����Ѵ�.
public class OrderManager {
	
	// bean ��Ͻ� �� ��°�� ���� (���� �� �� hyunai �ְ� setMaker �� �� kia �ְ� ���� ���ص� �ᱹ ���������� hyundai �� �ȴ�.)
	@Autowired
	@Qualifier("hyundai")
	private CarMaker maker;
	
	// �ڷ��� > ���̵�� ã�Ƽ� ����
	// bean ��Ͻ� ù ��°�� ����
	@Autowired	// �ʵ庯��, ������, �޼ҵ忡 ����� �����ϴ�.
	public OrderManager(@Qualifier("hyundai") CarMaker maker) {
		System.out.println("OrderManager Constructor");
		this.maker = maker;
	}
	
	public void order() {
		Money money = new Money(1000);
		System.out.println("OrerManager.order : I made " + money.getAmount());

		System.out.println("OrerManager.order : I payed " + money.getAmount());
		Car car = maker.sell(money);
		System.out.println("OrerManager.order : I recieved " + money.getAmount());
	}
	
	// ���̵� > �ڷ������� ã�Ƽ� ����. �����ڿ� ����� �Ұ��ϴ�.
	// bean ��Ͻ� �� ��°�� ����
	@Resource(name="kia")
	public void setMaker(CarMaker maker) {
		System.out.println("OrderManger setMaker");
		this.maker = maker;
	}
	
	// bean ��Ͻ� �� ��°�� ����. ������ ���� ��.
	@PostConstruct
	public void init() {
		System.out.println("OrderManager init");
	}
}
