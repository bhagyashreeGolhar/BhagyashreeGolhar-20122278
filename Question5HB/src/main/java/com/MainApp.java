package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Customer c=new Customer();
		c.setCid(200);
		c.setCname("Bhagyashree");
		c.setPlace("Nashik");
		c.setPan("123f45g");
		
		session.save(c);
		tx.commit();
		
		System.out.println("Data inserted Successfully...!");
		
	}
	
}
