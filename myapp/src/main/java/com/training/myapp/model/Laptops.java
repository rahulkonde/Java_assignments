package com.training.myapp.model;

public class Laptops {
	private String companyName;
	private String modelNo;
	private int price;

	public Laptops() {
		super();
	}

	public Laptops(String companyName, String modelNo, int price) {
		super();
		this.companyName = companyName;
		this.modelNo = modelNo;
		this.price = price;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptops [companyName=" + companyName + ", modelNo=" + modelNo + ", price=" + price + "]";
	}

}
