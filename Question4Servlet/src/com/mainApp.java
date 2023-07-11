package com;


import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
	
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e=(Employee) context.getBean("emp");
		
		int id=e.getId();
		String Name=e.getName();
		ArrayList<String> programmin=e.getProgrammings();
		
		System.out.println("ID: "+id+"Name: "+Name+"");
		for(String s:programmin)
		{
			System.out.println(s);
		}
	}

}
