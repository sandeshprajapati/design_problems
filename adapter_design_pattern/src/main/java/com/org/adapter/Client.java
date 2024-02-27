package com.org.adapter;

public class Client {
	public static void main(String[] args) {

		PowerAdapter adapter = new PowerAdapter(new TwoPinPowerSource());

		ElectronicDevice electronicDevice = new ElectronicDevice(adapter);
		electronicDevice.useUSBPower();

	}
}
