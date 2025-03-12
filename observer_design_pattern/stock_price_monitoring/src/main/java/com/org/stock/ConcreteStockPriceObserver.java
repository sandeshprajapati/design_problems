package com.org.stock;

public class ConcreteStockPriceObserver implements StockPriceObserver {

	private String observerName;

	public ConcreteStockPriceObserver(String observerName) {
		this.observerName = observerName;
	}

	@Override
	public void update(Stock stock) {
		if (stock instanceof ConcreteStock) {
			ConcreteStock concreteStock = (ConcreteStock) stock;
			System.out.println(observerName + " is notified! Stock: " + concreteStock.getStockSymbol() + " new price: "
					+ concreteStock.getStockPrice());
		}

	}

}
