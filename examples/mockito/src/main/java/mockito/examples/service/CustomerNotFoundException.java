package mockito.examples.service;

/**
 * @author Ted Vinke
 */
public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final long customerId;

	public CustomerNotFoundException(long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String getMessage() {
		return String.format("Customer with id %s not found.", customerId);
	}

}
