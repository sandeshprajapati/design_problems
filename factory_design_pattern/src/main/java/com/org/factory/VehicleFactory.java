package com.org.factory;

public class VehicleFactory {

	public Vehicle createVehicle(String vehicleType) {

		if (vehicleType.equalsIgnoreCase("TRUCK")) {
			return new Truck();
		} else if (vehicleType.equalsIgnoreCase("SHIP")) {
			return new Ship();
		} else if (vehicleType.equalsIgnoreCase("PLANE")) {
			return new Plane();
		} else {
			throw new IllegalArgumentException("Invalid vehicle type");
		}
	}
}
