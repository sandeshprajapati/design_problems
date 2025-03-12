package com.org.coffee.builder;

import com.org.coffee.BaseCoffee;
import com.org.coffee.SimpleCoffee;
import com.org.coffee.decorator.MilkDecorator;
import com.org.coffee.decorator.SugarDecorator;

public class CoffeeBuilder {

	BaseCoffee baseCoffee;

	public CoffeeBuilder() {
		this.baseCoffee = new SimpleCoffee(); // Start with a basic coffee
		System.out.println("Current cost: " + baseCoffee.cost());
	}

	public CoffeeBuilder addMilk() {
		System.out.println("Adding Milk");
		baseCoffee = new MilkDecorator(baseCoffee);
		System.out.println("Current cost: " + baseCoffee.cost());
		return this;
	}

	public CoffeeBuilder addSugar() {
		System.out.println("Adding Sugar");
		baseCoffee = new SugarDecorator(baseCoffee);
		System.out.println("Current cost: " + baseCoffee.cost());
		return this;
	}

	public BaseCoffee build() {
		return baseCoffee;
	}

}
