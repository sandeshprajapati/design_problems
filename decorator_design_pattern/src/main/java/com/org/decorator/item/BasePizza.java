package com.org.decorator.item;

public class BasePizza implements Item {

	@Override
	public String getDescription() {
		return "Pizza";
	}

	@Override
	public double cost() {
		return 10.0;
	}

}
