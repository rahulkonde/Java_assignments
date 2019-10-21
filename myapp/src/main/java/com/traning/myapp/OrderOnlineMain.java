package com.traning.myapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.training.myapp.model.OrderOnline;

public class OrderOnlineMain {
	public static void main(String[] args) {

		ArrayList<OrderOnline> orders = new ArrayList<>();
		orders.add(new OrderOnline(1, "Mobile", 8000, "Accepted"));
		orders.add(new OrderOnline(2, "laptop", 15000, "pending"));
		orders.add(new OrderOnline(3, "smartwatch", 10000, "Accepted"));
		orders.add(new OrderOnline(4, "pencil", 70000, "Accepted"));
		orders.add(new OrderOnline(5, "camera", 6000, "pending"));
		orders.add(new OrderOnline(6, "tv", 4000, "Accepted"));
//  to display all the orders
//		Consumer<OrderOnline> c = (e) -> System.out.println(e);
//	    orders.forEach(c);
	  
		// to display only accepted orders
	    
//	    	List <OrderOnline> acceptedorders  = new ArrayList<>();
//	    	for(OrderOnline order:orders)
//	    	{
//	    		if (order.getOrderStatus().equals("Accepted"))
//	    			acceptedorders.add(order);
//	    	}
//	    	for (OrderOnline order : acceptedorders) {
//	    		System.out.println(order);
//	    	}
	    
		
	// to display grater than 10000 and accepted orders
		List<OrderOnline> ordersabove10000 = new ArrayList<OrderOnline>();
		for (OrderOnline order : orders)
		{
			if ( order.getOrderPrice()>(10000) && order.getOrderStatus().equals("Accepted"))
				ordersabove10000.add(order);
		}
		for (OrderOnline order : ordersabove10000)
		{
			System.out.println(order);
		}
		
		
	
}
}
