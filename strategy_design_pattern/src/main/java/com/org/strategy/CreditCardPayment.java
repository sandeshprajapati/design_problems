package com.org.strategy;

public class CreditCardPayment implements PaymentStrategy {

	private String cardNumber;

	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using credit card: " + cardNumber);
	}

}
