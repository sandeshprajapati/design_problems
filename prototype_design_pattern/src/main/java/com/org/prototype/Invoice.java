package com.org.prototype;

public class Invoice implements DocumentPrototype {

	String type;

	public Invoice(String type) {
		this.type = type;
	}

	@Override
	public DocumentPrototype createClone() {
		return new Invoice(type);
	}

	@Override
	public void display() {
		System.out.println("Invoice Document - Type: " + type);
	}

}
