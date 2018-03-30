package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDaoInMemoryImpl implements ProductDao {
	private Map<Long,Product> productsMap = new HashMap<Long, Product>();
	{
		Product product1 = new Product(1L, "Leisure Time Metal Gon", 3.00, 6.00);
		Product product2 = new Product(2L, "Leisure Time Defender", 5.00, 10.00);
		
		productsMap.put(product1.getId(), product1);
		productsMap.put(product2.getId(), product2);
	}
	
	public void insert(Product product) {
		productsMap.put(product.getId(), product);
	}
	
	public void update(Product product) {
		productsMap.put(product.getId(), product);
	}
	
	public void update(List<Product> products) {
		for(Product product: products) {
			update(product);
		}
	}
	
	public void delete(long productId) {
		productsMap.remove(productId);
	}
	
	public Product find(long productId) {
		return productsMap.get(productId);
	}
	
	public List<Product> find(List<Long> productIds){
		List<Product> products = new ArrayList<Product>();
		for(Long id: productIds) {
			products.add(productsMap.get(id));
		}
		return products;
	}
	
	public List<Product> find(String productName){
		List<Product> products = new ArrayList<Product>();
		for(Product product: productsMap.values()) {
			if(productName.equals(product.getProductName())){
				products.add(product);
			}
		}
		return products;
	}
}