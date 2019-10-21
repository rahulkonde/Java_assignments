package com.training.myapp.model;

public class Car {

	private String carName;
	private int make;
	private double modelNumber;
	private String quality;
	private int price;
	
	public Car() {
		super();
	}

	public Car(String carName, int make, double modelNumber, String quality, int price) {
		super();
		this.carName = carName;
		this.make = make;
		this.modelNumber = modelNumber;
		this.quality = quality;
		this.price = price;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getMake() {
		return make;
	}

	public void setMake(int make) {
		this.make = make;
	}

	public double getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(double modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "carName=   " + carName + "    make=   " + make + "    modelNumber=   " + modelNumber + "   quality=   " + quality
				+ "   price=    " + price;
	}
	
	
}
