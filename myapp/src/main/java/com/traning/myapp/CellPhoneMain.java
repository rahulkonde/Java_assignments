package com.traning.myapp;

import java.util.HashSet;
import java.util.TreeSet;

import com.training.myapp.model.CellPhone;


public class CellPhoneMain {

	public static void main(String[] args) {
		
		TreeSet<CellPhone> mobile = new TreeSet<CellPhone>(); 
		mobile.add(new CellPhone("redmi", "XTR23D","FastRam","android" , 55000.0 ));
		mobile.add(new CellPhone("smasung", "s9+","bestCam","Windows" , 6000 ));
		mobile.add(new CellPhone("apple", "Xr","Quality","IOS" , 75000 ));
		for(CellPhone Cellphone:mobile) {
		
		System.out.println(Cellphone);
		}
		
//		CellPhone c = new CellPhone("redmi", "X712FD", "fastram","android",55000);
//		System.out.println(c);
//		// TODO Auto-generated method stub

	}
//
//	public static Object add(int number1, int number2) {
//		return number1+number2;
//	}

}
