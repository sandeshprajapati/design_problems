package problems.designpattern.builder;

public class ClientMain {

	public static void main(String[] args) {
		Customer customer=new CustomerBuilder()
				.firstName("Jelly")
				.middleName("Tomer")
				.lasName("John")
				.build();
		
		System.out.println(customer);

	}

}
