package com.traning.myapp;

import java.awt.List;
import java.util.ArrayList;

import com.training.myapp.model.Car;

public class CarMain {
	public static void main(String[] args) {
		
	
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(new Car("Audi",2018,37626,"premium",42353));
		list.add(new Car("Benz",2017,76367,"premium",43254));
		list.add(new Car("Ferrari",2016,82332,"premium",35234));
		list.add(new Car("Lamborgini",2015,96535,"premium",52154));
		for(Car range : list) {
		System.out.println(range);
		// Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		
	}}
	
	
	

}
