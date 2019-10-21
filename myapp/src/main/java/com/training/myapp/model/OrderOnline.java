package com.training.myapp.model;

public class OrderOnline {
	private int orderNumber;
	private String orderName;
	private double orderPrice;
	private String orderStatus;
	
	public OrderOnline() {
		super();
	}

	public OrderOnline(int orderNumber, String orderName, double orderPrice, String orderStatus) {
		super();
		this.orderNumber = orderNumber;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
		this.orderStatus = orderStatus;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "orderNumber=  " + orderNumber + "orderName=  " + orderName + "orderPrice=  " + orderPrice
				+ "  orderStatus=   " + orderStatus;
	}
	 
	
	

}
