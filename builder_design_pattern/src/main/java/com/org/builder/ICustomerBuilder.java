package com.org.builder;

public interface ICustomerBuilder {

	ICustomerBuilder firstName(String firstName);

	ICustomerBuilder lasName(String lastName);

	ICustomerBuilder middleName(String middleName);

	Customer build();

}
