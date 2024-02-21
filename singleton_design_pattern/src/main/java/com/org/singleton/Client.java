package com.org.singleton;

public class Client {

	public static void main(String[] args) {
		// Get the singleton instance of Logger
		Logger logger = Logger.getInstance();
		// Log messages
		logger.log("Application started");
		logger.log("Processing data");
		logger.log("Application finished");

		// Attempt to create another instance (won't work)
		Logger anotherLogger = Logger.getInstance();

		// Check if both instances are the same
		System.out.println("Are both instances the same? " + (logger == anotherLogger));
	}

}
