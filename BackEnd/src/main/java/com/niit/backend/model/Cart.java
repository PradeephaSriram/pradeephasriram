package com.niit.backend.model;

public class Cart {
     private int cartId;
     private String userName;
     private int productId;
     private String productName;
     private int productQuantity;
     private double proguctPrice;
     private boolean status;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public double getProguctPrice() {
		return proguctPrice;
	}
	public void setProguctPrice(double proguctPrice) {
		this.proguctPrice = proguctPrice;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
     
     
}
