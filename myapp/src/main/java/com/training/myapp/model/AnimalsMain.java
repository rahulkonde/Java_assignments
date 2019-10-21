package com.training.myapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AnimalsMain {

	public static void main(String[] args) {
		
		List<Animals> animals = new ArrayList<>();
		animals.add(new Animals("bunny",2,"rabbit",2.3));
		animals.add(new Animals("kitty",5,"cat",3.3));
		animals.add(new Animals("piggy",6,"pig",5.5));
		animals.add(new Animals("husky",5,"dog",3.2));
		animals.add(new Animals("hizz",4,"snake",6.0));
		animals.add(new Animals("jerry",2,"mouse",1.1));
		
		//how to use consumer To Print all the values
//		 Consumer<Animals> c = (A) -> System.out.println(A);                
//         animals.forEach(c);
//		
		// How to use Supplier
		Supplier<Animals> s = ()->new Animals("hizz",4,"snake",6.0);
		System.out.println(s.get());

		// how to use 
		
		
	}
}
