package mockito.examples.service;

import java.util.List;

import mockito.examples.model.CartItem;
import mockito.examples.model.Customer;
import mockito.examples.model.Order;
import mockito.examples.model.OrderItem;
import mockito.examples.model.Product;

/**
 * @author Ted Vinke
 */
public class SimpleOrderService implements OrderService {

	private CustomerService customerService;

	public SimpleOrderService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@Override
	public Order createOrder(long customerId, List<CartItem> items)
			throws CustomerNotFoundException, OutOfStockException {

		Customer customer = customerService.findCustomerById(customerId);
		if (customer == null) {
			throw new CustomerNotFoundException(customerId);
		}

		Order order = new Order(customer);
		for (CartItem item : items) {

			Product product = item.getProduct();
			int quantity = item.getQuantity();
			double price = product.getPrice();
			double totalPrice = price * quantity;

			order.addItem(new OrderItem(product, quantity, totalPrice));
		}

		order.setBilling(customer.getWorkAddress());
		order.setShipping(customer.getHomeAddress());

		return order;
	}

}
