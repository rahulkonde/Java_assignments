package com.training.myapp.model;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private double BasicSalary;
	private double HRA;
	private double Medical;
	private double PF;
	private double PT;
	private double NetSalary;
	private double GrossSalary;

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double salary) {
		super();

		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;
		this.BasicSalary = salary;
		this.HRA = 0.5 * getBasicSalary();
		this.PF = 0.12 * getBasicSalary();
		this.PF = 200;
		this.Medical = 100;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getHRA() {
		return HRA;
	}

	public void setHRA(double hRA) {
		HRA = hRA;
	}

	public double getMedical() {
		return Medical;
	}

	public void setMedical(double medical) {
		Medical = medical;
	}

	public double getPF() {
		return PF;
	}

	public void setPF(double pF) {
		PF = pF;
	}

	public double getPT() {
		return PT;
	}

	public void setPT(double pT) {
		PT = pT;
	}

	public double getNetSalary() {
		return NetSalary;
	}

	public void setNetSalary(double netSalary) {
		NetSalary = netSalary;
	}

	public double getGrossSalary() {
		return GrossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}

	public double getBasicSalary() {
		return BasicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		BasicSalary = basicSalary;
	}

	public double Grosssalary() {
		this.GrossSalary = this.BasicSalary + this.HRA + this.Medical;
		return GrossSalary;

	}

	public double NetSalary() {
		this.NetSalary = this.GrossSalary - (this.PF + this.PT);
		return NetSalary;
	}

	@Override
	public String toString() {
		return "EmployeeID   " + EmployeeId + "   EmployeeName   " + EmployeeName + "   BasicSalary   " + BasicSalary
				+ "  HRA  " + HRA + "    Medical   " + Medical + "    NetSalary  " + this.NetSalary()
				+ "  GrossSalary   " + this.Grosssalary();

	}

}
