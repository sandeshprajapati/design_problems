package com.org.weather;

public interface WeatherStation {
	
	void addObserver(WeatherObserver observer);

	void removeObserver(WeatherObserver observer);

	void notifyObservers();
}