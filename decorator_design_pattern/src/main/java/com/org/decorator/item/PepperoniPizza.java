package com.org.decorator.item;

public class PepperoniPizza extends BasePizza {

	BasePizza pizza;

	public PepperoniPizza(BasePizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return "Pepperoni " + pizza.getDescription();
	}

	@Override
	public double cost() {
		return pizza.cost() + 8.0;
	}

}
