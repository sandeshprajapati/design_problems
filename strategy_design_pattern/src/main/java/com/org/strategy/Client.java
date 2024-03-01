package com.org.strategy;

public class Client {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		// Selecting credit card payment strategy
		cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
		cart.checkout(100);

		// Changing payment strategy to PayPal
		cart.setPaymentStrategy(new PayPalPayment("example@example.com"));
		cart.checkout(50);

	}

}
