package com.org.singleton;

public class Logger {

	private static Logger instance = null;

	private Logger() {
	}

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	// Public method to log messages
	public void log(String message) {
		System.out.println("Log: " + message);
	}
}
