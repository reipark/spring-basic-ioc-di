package com.example.ioc2;

public class TestClient {

	public static void main(String[] args) {
		OrderManager manager = new OrderManager();
		manager.order();
	}
}
