package com.org.decorator.item;

public class BasePizza implements Item {

	@Override
	public String getDescription() {
		return "BasePizza";
	}

	@Override
	public double cost() {
		return 10.0;
	}

}
