package com.org.factory;

public class Client {
	public static void main(String[] args) {
		
		VehicleFactory vehicleFactory = new VehicleFactory();

		// Create a truck
		Vehicle truck = vehicleFactory.createVehicle("TRUCK");
		truck.transport();

		// Create a ship
		Vehicle ship = vehicleFactory.createVehicle("SHIP");
		ship.transport();
		// Create a plane
		Vehicle plane = vehicleFactory.createVehicle("PLANE");
		plane.transport();
	}

}
