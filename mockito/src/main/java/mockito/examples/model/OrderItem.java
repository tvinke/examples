package mockito.examples.model;


/**
 * @author Ted Vinke
 */
public class OrderItem {

	private final Product product;
	private final int quantity;
	private final double totalPrice;

	public OrderItem(Product product, int quantity, double totalPrice) {
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

}
