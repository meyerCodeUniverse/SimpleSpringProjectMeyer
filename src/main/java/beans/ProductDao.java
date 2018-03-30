package beans;

import java.util.List;

public interface ProductDao {
	
	public void insert(Product product);
	public void update(Product product);
	public void update(List<Product> products);
	public void delete(long productId);
	public Product find(long productId);
	public List<Product> find(List<Long> productIds);
	public List<Product> find(String productName);

}