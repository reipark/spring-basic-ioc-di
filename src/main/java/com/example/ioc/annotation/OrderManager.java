package com.example.ioc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//클래스의 용도를 구부하기 쉽게 하기 위해서 @Component를 확장해서 새로운 어노테이션을 만들었다.
@Service // id 를 지정하지 않으면 클래스 이름을 id로 사용한다. 단 id 는 소문자로 시작한다.
public class OrderManager {
	
	// bean 등록시 네 번째로 실행 (생성 할 때 hyunai 넣고 setMaker 할 때 kia 넣고 별짓 다해도 결국 마지막에는 hyundai 로 된다.)
	@Autowired
	@Qualifier("hyundai")
	private CarMaker maker;
	
	// 자료형 > 아이디로 찾아서 주입
	// bean 등록시 첫 번째로 실행
	@Autowired	// 필드변수, 생성자, 메소드에 사용이 가능하다.
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
	
	// 아이디 > 자료형으로 찾아서 주입. 생성자에 사용이 불가하다.
	// bean 등록시 두 번째로 실행
	@Resource(name="kia")
	public void setMaker(CarMaker maker) {
		System.out.println("OrderManger setMaker");
		this.maker = maker;
	}
	
	// bean 등록시 세 번째로 실행. 생성자 실행 후.
	@PostConstruct
	public void init() {
		System.out.println("OrderManager init");
	}
}
