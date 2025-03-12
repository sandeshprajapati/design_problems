package com.org.coffee;

public class SimpleCoffee implements BaseCoffee {

	@Override
	public double cost() {
		return 100;
	}

	@Override
	public String description() {
		return "Simple Coffee";
	}

}
