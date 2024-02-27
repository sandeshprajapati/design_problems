package com.org.adapter;

public class PowerAdapter implements PowerSource {

	private final TwoPinPowerSource twoPinPowerSource;

	public PowerAdapter(TwoPinPowerSource twoPinPowerSource) {
		this.twoPinPowerSource = twoPinPowerSource;
	}

	@Override
	public void providePower() {
		twoPinPowerSource.providePower();
	}

}
