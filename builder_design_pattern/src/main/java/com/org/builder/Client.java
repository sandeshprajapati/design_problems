package com.org.builder;

public class Client {

	public static void main(String[] args) {
		Customer customer=new CustomerBuilder()
				.firstName("Jelly")
				.middleName("Tomer")
				.lasName("John")
				.build();
		
		System.out.println(customer);

	}

}
