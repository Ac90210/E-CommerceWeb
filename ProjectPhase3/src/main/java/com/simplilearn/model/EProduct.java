package com.simplilearn.model;

import java.sql.Date;

public class EProduct {
	
	private long productId;
	private String productName;
	private Double price;
	private Date productDate;
	
	 
	    public Category getCategory() {
		return category;
	}
	
		private Category category;

	    public static enum Category {
	        NIKE,
	        ADDIDA,
	        PUMA
	    }
	    
	    public void setCategory(Category category) {
			this.category = category;
		}
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

}
