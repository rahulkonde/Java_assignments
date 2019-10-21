package com.traning.myapp;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Fact(int num) {
		int result = 1;
		for(int i=1; i<=num; i++)
		result= result*i;
		System.out.println(result);
		return result;
	}

}

 