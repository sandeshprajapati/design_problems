package com.org.decorator.pizza;

import com.org.decorator.item.Item;

public class PizzaDecorator implements Item {

	Item item;

	public PizzaDecorator(Item item) {
		this.item = item;
	}

	@Override
	public String getDescription() {
		return item.getDescription();
	}

	@Override
	public double cost() {
		return item.cost();
	}

}
