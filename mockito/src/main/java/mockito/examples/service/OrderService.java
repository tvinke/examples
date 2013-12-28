package mockito.examples.service;

import java.util.List;

import mockito.examples.model.CartItem;
import mockito.examples.model.Order;

/**
 * @author Ted Vinke
 */
public interface OrderService {

	Order createOrder(long customerId, List<CartItem> items)
			throws CustomerNotFoundException;

}