package problems.designpattern.builder;

public class Customer {

	private String firstName;
	private String midleName;
	private String lastName;

	public Customer(CustomerBuilder builder) {
		this.firstName = builder.getFirstName();
		this.lastName = builder.getLastName();
		this.midleName = builder.getMiddleName();

	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", midleName=" + midleName + ", lastName=" + lastName + "]";
	}

}
