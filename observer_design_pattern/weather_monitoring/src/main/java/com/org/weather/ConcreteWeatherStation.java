package com.org.weather;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWeatherStation implements WeatherStation {
	
	private List<WeatherObserver> observers = new ArrayList<>();
	
	private double temperature;
    private double humidity;


	@Override
	public void addObserver(WeatherObserver observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(WeatherObserver observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (WeatherObserver observer : observers) {
			observer.update(this);
		}
	}
	
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
		notifyObservers();
	}
	
	public double getTemperature() {
		return temperature;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		notifyObservers();
	}

	public double getHumidity() {
		return humidity;
	}

}
