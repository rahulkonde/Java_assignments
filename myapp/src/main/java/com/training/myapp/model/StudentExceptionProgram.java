package com.training.myapp.model;

import com.training.myapp.Ecxeption.AgeNotWithinRangeException;

public class StudentExceptionProgram {
	private int rollNo;
	private String name;
	private int age;
	private String Course;
	
	public StudentExceptionProgram() {
		super();
	}

	public StudentExceptionProgram(int rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		Course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	@Override
	public String toString() {
		return "StudentExceptionProgram [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", Course=" + Course
				+ "]";
	}
	
	public int studentAgeEcxeption() throws AgeNotWithinRangeException
	{	try {
		{
			if (age<22 && age >15)
				return 0;
		throw new AgeNotWithinRangeException("AgeNotWithinRangeException") ;
			
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;

}
}
