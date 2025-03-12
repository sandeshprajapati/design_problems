package com.org.weather;

public class WeatherApp implements WeatherObserver {

	private String appName;

	public WeatherApp(String appName) {
		this.appName = appName;
	}

	@Override
	public void update(WeatherStation weatherStation) {

		if (weatherStation instanceof ConcreteWeatherStation) {
			ConcreteWeatherStation concreteWeatherStation = (ConcreteWeatherStation) weatherStation;
			System.out.println(appName + " - The temperature is: " + concreteWeatherStation.getTemperature());
		}
	}

}
