package com.org.stock;

public interface Stock {

	void attach(StockPriceObserver observer);

	void detach(StockPriceObserver observer);

	void notifyObservers();
}