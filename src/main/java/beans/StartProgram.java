package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		ProductService productService = applicationContext.getBean("productService", ProductService.class);
		
		System.out.println("Before updates");
		System.out.println("Product 1: " + productService.getProduct(1).getProductName());
		System.out.println("Product 2: " + productService.getProduct(2).getCost());
		
		productService.updateProductName(1L, "Leisure Time Metal Gon", 3.00, 6.00);
		productService.updateProductCost(2L, "Leisure Time Defender", 5.00, 10.00);
		
		System.out.println("After money transfer");
		System.out.println("Product 1: " + productService.getProduct(1).getProductName());
		System.out.println("Product 2: " + productService.getProduct(2).getCost());
	}

}
