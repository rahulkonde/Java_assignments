package com.traning.myapp;

public class EmployeeInformation {
	

	private int empId; 
	private String employeeName;
	private String employeeDesignation; 
	private int employeeSalary; 
	private String employeeCommunications;
		public EmployeeInformation()
		{
			
		}
			public EmployeeInformation(int empId, String employeeName, String employeeInformation, int employeeSalary, String employeeCommunications) 
			{
			this.empId = empId;
			this.employeeName= employeeName;
			this.employeeDesignation= employeeDesignation;
			this.employeeSalary=employeeSalary;
			this.employeeCommunications=employeeCommunications;
		}
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeCommunications() {
		return employeeCommunications;
	}
	public void setEmployeeCommunications(String employeeCommunications) {
		this.employeeCommunications = employeeCommunications;
	}
}


	   