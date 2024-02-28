package com.org.decorator.item;

public class MargheritaPizza extends BasePizza {

	BasePizza pizza;

	public MargheritaPizza(BasePizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return "Margherita " + pizza.getDescription();
	}

	@Override
	public double cost() {
		return pizza.cost() + 5.0;
	}

}
