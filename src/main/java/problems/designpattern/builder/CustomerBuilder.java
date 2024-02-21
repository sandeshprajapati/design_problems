package problems.designpattern.builder;

public class CustomerBuilder implements ICustomerBuilder {

	private String firstName;
	private String middleName;
	private String lastName;

	@Override
	public ICustomerBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	@Override
	public ICustomerBuilder lasName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public ICustomerBuilder middleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	@Override
	public Customer build() {
		return new Customer(this);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

}
