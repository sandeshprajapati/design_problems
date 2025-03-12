package com.org.stock;

public class StockPriceMonitoringSystem {

	public static void main(String[] args) {

		// Create a stock (e.g., Apple)
		ConcreteStock appleStock = new ConcreteStock("AAPL", 140.00);

		// Create observers (stock price watchers)
		ConcreteStockPriceObserver investor1 = new ConcreteStockPriceObserver("Investor 1");
		ConcreteStockPriceObserver investor2 = new ConcreteStockPriceObserver("Investor 2");

		// Attach observers to the stock
		appleStock.attach(investor1);
		appleStock.attach(investor2);

		// Simulate stock price changes
		System.out.println("Changing Apple stock price to $150");
		appleStock.setStockPrice(150.00); // Both observers will be notified

		// Detach an observer
		appleStock.detach(investor1);

		// Change stock price again
		System.out.println("Changing Apple stock price to $160");
		appleStock.setStockPrice(160.00); // Only Investor 2 will be notified
	}

}
