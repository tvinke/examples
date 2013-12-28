package mockito.examples.service;

import mockito.examples.model.Product;

/**
 * @author Ted Vinke
 */
public interface ProductService {

	Product getProductById(long productId);

	boolean isProductInStock(long productId, int howMuch);
}
