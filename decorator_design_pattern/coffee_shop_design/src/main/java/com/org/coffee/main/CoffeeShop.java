package com.org.coffee.main;

import com.org.coffee.BaseCoffee;
import com.org.coffee.builder.CoffeeBuilder;

public class CoffeeShop {

	public static void main(String[] args) {
		
		// Using Builder to construct a coffee with Milk and Sugar
        CoffeeBuilder builder = new CoffeeBuilder();
        BaseCoffee myCoffee = builder.addMilk().addSugar().build();

        // Output the description and cost
        System.out.println(myCoffee.description() + " | Cost: $" + myCoffee.cost());
	}

}
