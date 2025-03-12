package com.org.decorator.pizza;

import com.org.decorator.item.Item;

public class ExtraCheeseDecorator extends PizzaDecorator {

	public ExtraCheeseDecorator(Item item) {
		super(item);
	}

	@Override
	public String getDescription() {
		return item.getDescription() + " with Extra Cheese";
	}

	@Override
	public double cost() {
		return item.cost() + 2.0;
	}

}
