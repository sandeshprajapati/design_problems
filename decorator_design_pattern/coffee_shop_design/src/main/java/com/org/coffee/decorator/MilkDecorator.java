package com.org.coffee.decorator;

import com.org.coffee.BaseCoffee;

public class MilkDecorator extends CoffeeDecorator {

	public MilkDecorator(BaseCoffee baseCoffee) {
		super(baseCoffee);
	}

	@Override
	public double cost() {
		return super.cost() + 15.0;
	}

	@Override
	public String description() {
		return super.description() + " with Milk";
	}

}
