package com.org.decorator;

import com.org.decorator.item.Item;

public class VeggieToppingsDecorator extends PizzaDecorator {

	public VeggieToppingsDecorator(Item item) {
		super(item);
	}

	@Override
	public String getDescription() {
		return item.getDescription() + " with Veggie Toppings";
	}

	@Override
	public double cost() {
		return item.cost() + 1.0;
	}

}
