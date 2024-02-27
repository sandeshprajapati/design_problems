package com.org.adapter;

public class TwoPinPowerSource implements PowerSource {

	@Override
	public void providePower() {
		System.out.println("Providing power with a two-pin plug");
	}

}
