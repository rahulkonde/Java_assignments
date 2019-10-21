package com.training.main;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.model.Mobiles;
import com.training.util.HibernateUtil;

public class MyMobiles {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
	
	//	Mobiles mobile = new Mobiles("oppo",25000,"4Gbram","cameradon");
//		Mobiles mobile2 = new Mobiles("lenovo",18000,"6Gbram","morestporage");
//
	//	session.save(mobile);
	//	System.out.println(session.save(mobile));
		
//		tx.commit();
//		session.close();
//		HibernateUtil.closeSessionFactory(); 
//		
		
		
//		Mobiles mobile = (Mobiles) session.get(Mobiles.class ,7);

//		Mobiles mobile = (Mobiles) session.get(Mobiles.class, 5);
//		if (mobile!=null)
//			mobile.setMobile_Ram("9gb");
//		
//		tx.commit();
//		System.out.println(mobile);
//	    session.close();
//		HibernateUtil.closeSessionFactory(); 
		
		Mobiles mobile = (Mobiles) session.get(Mobiles.class, 5);
		if (mobile!=null)
			session.delete(mobile);
		tx.commit();
		System.out.println(mobile);
	    session.close();
		HibernateUtil.closeSessionFactory(); 
		
		
		
		
		
	}
}
