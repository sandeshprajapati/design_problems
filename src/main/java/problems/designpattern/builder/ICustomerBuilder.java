package problems.designpattern.builder;

public interface ICustomerBuilder {

	ICustomerBuilder firstName(String firstName);

	ICustomerBuilder lasName(String lastName);

	ICustomerBuilder middleName(String middleName);

	Customer build();

}
