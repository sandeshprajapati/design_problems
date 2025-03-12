package com.org.stock;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements Stock {

	private String stockSymbol;
	private double stockPrice;
	private List<StockPriceObserver> observers;

	public ConcreteStock(String stockSymbol, double stockPrice) {
		this.stockSymbol = stockSymbol;
		this.stockPrice = stockPrice;
		observers = new ArrayList<>();
	}

	@Override
	public void attach(StockPriceObserver observer) {
		observers.add(observer);
	}

	@Override
	public void detach(StockPriceObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (StockPriceObserver observer : observers) {
			observer.update(this);
		}
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
		notifyObservers();
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public double getStockPrice() {
		return stockPrice;
	}

}
