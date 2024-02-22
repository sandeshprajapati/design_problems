package com.org.factory;

public class Ship implements Vehicle {

	@Override
	public void transport() {
		System.out.println("Ship is transporting goods by sea.");
	}

}
