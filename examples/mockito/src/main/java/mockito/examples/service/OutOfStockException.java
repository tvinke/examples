package mockito.examples.service;

/**
 * @author Ted Vinke
 */
public class OutOfStockException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final long productId;

	public OutOfStockException(long productId) {
		this.productId = productId;
	}

	@Override
	public String getMessage() {
		return String.format("Product with id %s is out of stock.", productId);
	}

}
