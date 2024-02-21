package com.org.prototype;

public class Report implements DocumentPrototype {

	private String format;

	public Report(String format) {
		this.format = format;
	}

	@Override
	public DocumentPrototype createClone() {
		return new Report(format);
	}

	@Override
	public void display() {
		System.out.println("Report Document - Format: " + format);

	}

}
