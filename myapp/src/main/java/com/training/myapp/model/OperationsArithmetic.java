package com.training.myapp.model;

public class OperationsArithmetic {
	public static void main(String[] args) {

		ArithemnticCalculations add = (a, b) -> (a + b);
		ArithemnticCalculations sub = (a, b) -> (a - b);
		ArithemnticCalculations mul = (a, b) -> (a * b);
		ArithemnticCalculations div = (a, b) -> (a / b);
		System.out.println("sum of two numbers " + add.operations(10, 20));
		System.out.println("subraction od two numbers  " + sub.operations(35, 20));
		System.out.println("multiplication of two numbres  " + mul.operations(11, 22));
		System.out.println("division of two numbers  " + div.operations(55, 11));
	}

}

//haa
//first orders dhi model claa
//class
//public class Order {
//
//private int orderNumber;
//private String orderNAme;
//private double orderPrice;
//private String orderStatus; 
//vitiki getters and setters chesa
// 
//
//
//public class OrderMain {  
//public class OrderMain {
//public static void main(String[] args) {
//	ArrayList<Order> orders=new ArrayList<Order>();
//	orders.add(new Order(1, "Mobile", 70000, "pending"));
//	orders.add(new Order(2,"PowerBank",2000,"Pending"));
//	orders.add(new Order(3,"Tshirt",500,"Completed"));
//	orders.add(new Order(4, "Slippers", 90, "Completed"));
//	orders.add(new Order(5, "PhoneCase", 100, "Completed"));
//	orders.add(new Order(6,"DressingTable",7000,"Pending"));
//	orders.add(new Order(7, "SofaSet",50000, "Pending"));
//	orders.add(new Order(8, "PopUpButton", 50, "Completed"));
//	orders.add(new Order(9, "WildCraftBag", 1000, "Completed"));
//	// display all details
////	for (Order order : orders) {
////		System.out.println(order);
////	}
//	//displaying all details using functional interfaces
////	public interface Consumer<T>{
////		public void accept(T t);
////		
////	}
////	@Override
////	public void accept(T t) {
////		System.out.println(t);
////	}
//	//function interface using lambda expression
////	Consumer<Order> order=(o)->System.out.println(o);
////	orders.forEach(order); 
