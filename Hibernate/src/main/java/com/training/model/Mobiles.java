package com.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobiles")
public class Mobiles {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mobile_Id;
	private String mobile_Company;
	private double mobile_Price;
	private String mobile_Ram;
	private String specification;
	
	public Mobiles() {
		super();
	}

	public Mobiles(String mobile_Company, double mobile_Price, String mobile_Ram, String specification) {
		super();
		this.mobile_Company = mobile_Company;
		this.mobile_Price = mobile_Price;
		this.mobile_Ram = mobile_Ram;
		this.specification = specification;
	}

	public int getMobile_Id() {
		return mobile_Id;
	}

	public void setMobile_Id(int mobile_Id) {
		this.mobile_Id = mobile_Id;
	}

	public String getMobile_Company() {
		return mobile_Company;
	}

	public void setMobile_Company(String mobile_Company) {
		this.mobile_Company = mobile_Company;
	}

	public double getMobile_Price() {
		return mobile_Price;
	}

	public void setMobile_Price(double mobile_Price) {
		this.mobile_Price = mobile_Price;
	}

	public String getMobile_Ram() {
		return mobile_Ram;
	}

	public void setMobile_Ram(String mobile_Ram) {
		this.mobile_Ram = mobile_Ram;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	@Override
	public String toString() {
		return "mobile_Id=   " + mobile_Id + "mobile_Company=   " + mobile_Company + "mobile_Price=   "
				+ mobile_Price + "Mobile_Ram=  " + mobile_Ram + "specification=  " + specification ;
	}
	
	

}
