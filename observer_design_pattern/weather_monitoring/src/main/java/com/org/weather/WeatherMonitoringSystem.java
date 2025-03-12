package com.org.weather;

public class WeatherMonitoringSystem {

	public static void main(String[] args) {

		// Create a weather station (subject)
		ConcreteWeatherStation weatherStation = new ConcreteWeatherStation();

		// Create weather apps (observers)
		WeatherApp app1 = new WeatherApp("WeatherApp 1");
		WeatherApp app2 = new WeatherApp("WeatherApp 2");

		// Subscribe the apps to the weather station
		weatherStation.addObserver(app1);
		weatherStation.addObserver(app2);

		// Simulate weather updates
		System.out.println("Weather station updates temperature to 25°C and humidity to 60%");
		weatherStation.setTemperature(25.0);
		weatherStation.setHumidity(60.0);

		System.out.println("\nWeather station updates temperature to 30°C and humidity to 55%");
		weatherStation.setTemperature(30.0);
		weatherStation.setHumidity(55.0);

		// Unsubscribe an app
		weatherStation.removeObserver(app1);

		// Simulate another weather update
		System.out.println("\nWeather station updates temperature to 28°C and humidity to 50%");
		weatherStation.setTemperature(28.0);
		weatherStation.setHumidity(50.0);

	}

}
