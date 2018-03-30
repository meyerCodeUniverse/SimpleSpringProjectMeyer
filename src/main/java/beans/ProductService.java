package beans;

public interface ProductService {

	public void updateProductName(long id, String productName, double cost, double retail);
	public void updateProductCost(long id, String productName, double cost, double retail);
	public Product getProduct(long productId);
}