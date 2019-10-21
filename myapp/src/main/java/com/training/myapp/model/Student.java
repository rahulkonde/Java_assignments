package com.training.myapp.model;

import com.training.myapp.Ecxeption.AgeNotWithinRangeException;
import com.training.myapp.Ecxeption.AgeisNotWithInRange;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private String course;

	public Student() {
		super();
	}

	public Student(int rollNo, String name, int age, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
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
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "rollNo=  " + rollNo + " name=  " + name + "  age=  " + age + "  course=  " + course ;
	}

	public int studentageexception() throws AgeisNotWithInRange
	{
		try  {
			if (age > 15 && age < 21 )
				return 0;
				throw new AgeisNotWithInRange("ageisnotwithinlimit");
		}
		catch ( Exception ageisnotwithinlimit ) {
			ageisnotwithinlimit.printStackTrace();
		}
		return 0;
		
		
		
		
	}
}
