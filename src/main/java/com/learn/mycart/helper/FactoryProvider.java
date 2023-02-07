package com.learn.mycart.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	private static SessionFactory factory;
	public static  SessionFactory getFactory()
	{
		try {
			
			if(factory == null)
			{
				//Configuration cfg = new Configuration();
				//factory = (SessionFactory) cfg.configure("hibernate.cfg.xml");
			factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			}
			
			
		} catch (Exception e) {
		
		e.printStackTrace();
		}
		return factory;
	}
}
