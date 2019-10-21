package com.training.myapp.model;
import java.util.List;
public class LaptopsJdbc {
	public static void main(String[] args) {
		LaptopsDao L = new LaptopsDao();
		
	if (L.addLaptops(new Laptops("apple","macseries",80000)))
		
		System.out.println("laptop found");
	else
		System.out.println("laptop not found");
	
	
//	Laptops laptop=L.findEmployeeById("apple");
//	if(laptop!=null)
//		System.out.println("laptop is present");
//	else
//		System.out.println("laptop id not available");
	List<Laptops> laptops=L.findAllLaptops();
	for (Laptops laptop : laptops) {
		System.out.println(laptop);
	}
	
//	Laptops laptop = L.findAllLaptops(5);
//	if(laptop != null)
//		System.out.println(employee);
//	else
//		System.out.println("-- Employee Record not found --");
//	
	}
	
	

}
