package beans;

import java.util.Date;

public class Product {
	private long id;
	private String productName;
	private double cost;
	private double retail;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getRetail() {
		return retail;
	}
	public void setRetail(double retail) {
		this.retail = retail;
	}
	
	public Product() {
		
	}
	public Product(long id, String productName, double cost, double retail) {
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.retail = retail;
	}
	
	
	
}	