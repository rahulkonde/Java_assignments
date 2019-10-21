package com.training.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.training.model.Fruit;

public class FruitsMain {

	public static void main(String[] args) {

		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("apple", 200, 50, "red"));
		fruits.add(new Fruit("banana", 250, 30, "yellow"));
		fruits.add(new Fruit("grapes", 400, 80, "green"));
		fruits.add(new Fruit("mango", 600, 40, "yellow"));
		fruits.add(new Fruit("orange", 80, 50, "orange"));
		fruits.add(new Fruit("promogranate", 90, 70, "red"));
		fruits.add(new Fruit("guava", 95, 80, "green"));
		// to count number of objects 
		//  long numberoffriuts= fruits.stream().filter((f) -> f.getPrice()<=50).count();
		 // System.out.println(namesoffruits);
		 
		// to display all values
//	    	 Consumer<Fruit> c = (F) -> System.out.println(F);
//	    	 fruits.forEach(c);

		// to display calories lessthan 100 in descending
//		Comparator<Fruit> c = (f1, f2) -> {
//			int result = Integer.compare(f2.getCalories(), f1.getCalories());
//			return result;
//		};
//		//Predicate<Fruit> p = (f) -> f.getCalories() < 100;
//		 List<Fruit> calorieslessthan100 = fruits.stream()
//		                                        .filter((f) -> f.getCalories() < 100)
//		                                        .sorted(c)
//		                                         .collect( Collectors.toList());
//		                                        		 
//		//calorieslessthan100.forEach(f -> System.out.println(f));

		// to dispaly colorwise list of fruitnames

//		Predicate<Fruit> p = (f) -> f.getColor().equals("red");
//		List<Fruit> colorwise = fruits.stream().filter(p).collect(Collectors.toList());
//
//		colorwise.forEach(f -> System.out.println(f));
//
//		Predicate<Fruit> q = (f) -> f.getColor().equals("yellow");
//		List<Fruit> colorwise1 = fruits.stream().filter(q).collect(Collectors.toList());
//
//		colorwise1.forEach(f -> System.out.println(f));
//
//		Predicate<Fruit> r = (f) -> f.getColor().equals("green");
//		List<Fruit> colorwise2 = fruits.stream().filter(r).collect(Collectors.toList());
//
//		colorwise2.forEach(f -> System.out.println(f));
//
//		Predicate<Fruit> s = (f) -> f.getColor().equals("orange");
//		List<Fruit> colorwise3 = fruits.stream().filter(s).collect(Collectors.toList());
//
//		colorwise3.forEach(f -> System.out.println(f));
		
		// to display only red color fruits in ascending order of their price
		
//		Comparator<Fruit> c = (f1,f2) ->{
//			int result = Integer.compare(f1.getPrice(), f2.getPrice());
//			return result;
//			};
//			Predicate<Fruit> p = (f) -> f.getColor().equals("red");
//			
//			List<Fruit> redcolcorfruits = fruits.stream()
//					                          .filter(p)
//					                          .sorted(c)
//					                          .collect(Collectors.toList());
//			redcolcorfruits.forEach( e -> System.out.println(e));
		
		
		
		
		
		
		

	}

}
