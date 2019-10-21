package com.traning.myapp;

import com.training.myapp.model.Date;
import com.training.myapp.model.Employee;
import com.training.myapp.model.Manager;
import com.training.myapp.model.MarketingExecutive;

public class employeeMain  {
	public static void main(String[] args) {
		Date d1= new Date (22,9,2019);
		System.out.println(d1);
		
			Employee E = new Employee ( 1001, " Rahul", 15000);
					System.out.println(E);
					
					Manager M = new Manager (1002,"Begum",18000);
					
					System.out.println("\n\r"+M);
					
					MarketingExecutive me = new MarketingExecutive(1003,"Employee3",89890,500);
					System.out.println(me);
		
	}

}
