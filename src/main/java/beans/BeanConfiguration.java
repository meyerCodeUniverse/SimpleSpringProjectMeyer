package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public ProductDao productDao() {
		ProductDaoInMemoryImpl bean = new ProductDaoInMemoryImpl();
		return bean;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public ProductService productService() {
		ProductServiceImpl bean = new ProductServiceImpl(productDao());
		//bean.setAccountDao(accountDao());
		return bean;
	}
	
	// @Bean
	// public ProductDao productDaoJpa() {
	// 	ProductDaoJpaImpl bean = new ProductDaoJpaImpl();
	// 	return bean;
	//}
	

}