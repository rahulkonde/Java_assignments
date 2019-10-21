package com.training.myapp.model;

public class CellPhone implements Comparable<CellPhone> {
	String companyName;
	String model;
	String description;
	String operatingSystem;
	double price;
	
	public CellPhone() {
		super();
	}

	public CellPhone(String companyName, String model, String description, String operatingSystem, double price) {
		super();
		this.companyName = companyName;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CellPhone [companyName=" + companyName + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
public int compareTo(CellPhone o) {
		// TODO Auto-generated method stub
		return Double.compare(o.price, this.price);
	}
	

}
