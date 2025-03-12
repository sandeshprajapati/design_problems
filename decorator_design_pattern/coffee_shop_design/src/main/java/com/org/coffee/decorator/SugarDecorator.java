package com.org.coffee.decorator;

import com.org.coffee.BaseCoffee;

public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(BaseCoffee baseCoffee) {
		super(baseCoffee);
	}

	@Override
	public double cost() {
		return super.cost() + 5.0;
	}

	@Override
	public String description() {
		return super.description() + " with Sugar";
	}

}
