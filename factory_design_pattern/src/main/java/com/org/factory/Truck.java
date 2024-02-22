package com.org.factory;

public class Truck implements Vehicle {

	@Override
	public void transport() {
		System.out.println("Truck is transporting goods by road.");
	}

}
