package com.training.myapp;

//class OuterClass {
//	  int x = 10;
//
//	static  class  InnerClass {
//	    int y = 5;
//	  }
//	
//
//	public static class MyMainClass {
//	  public static void main(String[] args) {
//	    OuterClass myOuter = new OuterClass();
//	    InnerClass myInner = new OuterClass.InnerClass();
//	    System.out.println(myInner.y + myOuter.x);
//	  }
//	}
//}

import java.util.Scanner;

public class OuterClass {
  public static void main(String[] args)
  {
	  OuterClass out = new OuterClass();
	  Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
