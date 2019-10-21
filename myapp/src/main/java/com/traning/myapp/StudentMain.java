package com.traning.myapp;

import com.training.myapp.model.Student;
import com.training.myapp.Ecxeption.AgeisNotWithInRange;


public class StudentMain {

	public static void main(String[] args) throws AgeisNotWithInRange {
		Student s = new Student( 14,"name",20,"java");
		System.out.println(s.studentageexception());
	}
}
