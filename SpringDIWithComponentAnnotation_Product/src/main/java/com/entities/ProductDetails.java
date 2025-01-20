package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("product")
public class ProductDetails {
	
	@Value("1001")
	private int productId;
	@Value("Lipstick")
	private String productName;
	@Value("3")
	private int productStock;
	@Value("Mac Factory")
	private String productSource;
	@Value("Beauty")
	private String productCategory;
	
	@Autowired(required=true)	
	private ProductSelling sale;

	public ProductDetails() {
		
	}

	public ProductDetails(int productId, String productName, int productStock, String productSource,
			String productCategory, ProductSelling sale) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productStock = productStock;
		this.productSource = productSource;
		this.productCategory = productCategory;
		this.sale = sale;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public String getProductSource() {
		return productSource;
	}

	public void setProductSource(String productSource) {
		this.productSource = productSource;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public ProductSelling getSale() {
		return sale;
	}

	public void setSale(ProductSelling sale) {
		this.sale = sale;
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", productStock="
				+ productStock + ", productSource=" + productSource + ", productCategory=" + productCategory + ", sale="
				+ sale + "]";
	}
	
	

}
