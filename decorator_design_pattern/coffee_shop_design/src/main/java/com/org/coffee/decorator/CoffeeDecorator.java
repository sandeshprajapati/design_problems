package com.org.coffee.decorator;

import com.org.coffee.BaseCoffee;

public abstract class CoffeeDecorator implements BaseCoffee {

	BaseCoffee baseCoffee;

	public CoffeeDecorator(BaseCoffee baseCoffee) {
		this.baseCoffee = baseCoffee;
	}

	@Override
	public double cost() {
		return baseCoffee.cost();
	}

	@Override
	public String description() {
		return baseCoffee.description();
	}

}
