package mockito.examples.service;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.Collections;

import mockito.examples.model.CartItem;
import mockito.examples.model.Customer;
import mockito.examples.model.Order;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SimpleOrderServiceTest {

	@Mock
	private CustomerService customerService;

	@Mock
	private ProductService productService;

	@InjectMocks
	private SimpleOrderService orderService;

	@Mock
	private Customer existingCustomer;

	@Before
	public void setUp() {
		System.out.println(orderService);
	}

	@Test(expected = CustomerNotFoundException.class)
	public void testCreateOrderShouldFailOnMissingCustomer() {

		// given
		given(customerService.findCustomerById(1L)).willReturn(null);

		// when
		orderService.createOrder(1L, Collections.<CartItem> emptyList());
	}

	@Test
	public void testCreateOrderShouldFindExistingCustomer() {

		// given
		given(customerService.findCustomerById(1L))
				.willReturn(existingCustomer);

		// when
		Order createdOrder = orderService.createOrder(1L,
				Collections.<CartItem> emptyList());

		// then
		assertThat(createdOrder.getCustomer(), equalTo(existingCustomer));
	}

}
