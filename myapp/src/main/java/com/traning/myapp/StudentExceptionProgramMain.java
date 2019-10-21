package com.traning.myapp;

import com.training.myapp.Ecxeption.AgeNotWithinRangeException;
import com.training.myapp.model.StudentExceptionProgram;

public class StudentExceptionProgramMain {
	public static void main(String[] args) throws AgeNotWithinRangeException {
		
		StudentExceptionProgram S = new StudentExceptionProgram(12,"Ddsasd",21,"ytyy");
		System.out.println(S.studentAgeEcxeption());
		
	}

}
