package com.training.myapp.model;

public class Animals {
	private String animalName;
	private int animalAge;
	private String animalType;
	private double animalHeight;
	public Animals() {
		super();
	}
	public Animals(String animalName, int animalAge, String animalType, double d) {
		super();
		this.animalName = animalName;
		this.animalAge = animalAge;
		this.animalType = animalType;
		this.animalHeight = d;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public int getAnimalAge() {
		return animalAge;
	}
	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public double getAnimalHeight() {
		return animalHeight;
	}
	public void setAnimalHeight(double animalHeight) {
		this.animalHeight = animalHeight;
	}
	@Override
	public String toString() {
		return "animalName=" + animalName + " animalAge=  " + animalAge + "animalType=   " + animalType
				+ "animalHeight=  " + animalHeight;
	}
	

}
