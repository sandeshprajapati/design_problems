package com.org.adapter;

//Client code (Electronic device expecting power through USB-C)
public class ElectronicDevice {

	private PowerSource powerSource;

	public ElectronicDevice(PowerSource powerSource) {
		this.powerSource = powerSource;
	}

	void useUSBPower() {
		System.out.println("Device is using power from USB-C");
		powerSource.providePower();// Using the provided power source
	}

}
