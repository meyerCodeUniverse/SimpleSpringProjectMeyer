package beans;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao;
	
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public ProductDao getProductDao() {
		return productDao;
	}
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void updateProductName(long id, String productName, double cost, double retail) {
		Product sourceProduct = productDao.find(id);
				
		sourceProduct.setProductName("Leisure Time Bright and Clear");
		
		productDao.update(sourceProduct);
		
	}
		
	public void updateProductCost(long id, String productName, double cost, double retail) {
		Product product = productDao.find(id);
		product.setCost(4.00);
		productDao.update(product);
	}
		
	public Product getProduct(long id) {
		return productDao.find(id);
		}

}