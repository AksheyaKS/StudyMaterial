package com.cg.model;

import org.springframework.stereotype.Component;

@Component
public class ProductDTO {
	private Integer productId;	
	private String productName;
	private Integer price;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	

}
