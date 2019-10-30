package com.ofss.firstspring.firstspring;

public class Product {

	String productID;
	String productDescription;
	String productVersion;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productID, String productDescription, String productVersion) {
		super();
		this.productID = productID;
		this.productDescription = productDescription;
		this.productVersion = productVersion;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
