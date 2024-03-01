package com.org.decorator.client;

import com.org.decorator.ExtraCheeseDecorator;
import com.org.decorator.VeggieToppingsDecorator;
import com.org.decorator.item.BasePizza;
import com.org.decorator.item.Item;
import com.org.decorator.item.MargheritaPizza;
import com.org.decorator.item.PepperoniPizza;

public class PizzaCostCalculator {
	public static void main(String[] args) {

		// Order a Margherita Pizza

		BasePizza basePizza = new BasePizza();

		BasePizza margheritaPizza = new MargheritaPizza(basePizza);
		System.out.println("Cost of Margherita Pizza: $" + margheritaPizza.cost());

		// Add Extra Cheese to the Margherita Pizza
		Item extraCheeseMargherita = new ExtraCheeseDecorator(margheritaPizza);
		System.out.println("Cost of Extra Cheese Margherita Pizza: $" + extraCheeseMargherita.cost());

		// Order a Pepperoni Pizza with Veggie Toppings
		Item pepperoniVeggiePizza = new VeggieToppingsDecorator(new PepperoniPizza(basePizza));
		System.out.println("Cost of Pepperoni Pizza with Veggie Toppings: $" + pepperoniVeggiePizza.cost());

	}
}
