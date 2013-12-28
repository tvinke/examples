package mockito.examples.model;

import java.util.Date;

/**
 * @author Ted Vinke
 */
public class CartItem {

	private final Product product;
	private final int quantity;
	private final Date dateAdded;

	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		this.dateAdded = new Date();
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

}
