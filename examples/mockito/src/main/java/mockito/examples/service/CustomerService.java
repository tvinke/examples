package mockito.examples.service;

import mockito.examples.model.Customer;

/**
 * @author Ted Vinke
 */
public interface CustomerService {

	Customer findCustomerById(long customerId);
}
