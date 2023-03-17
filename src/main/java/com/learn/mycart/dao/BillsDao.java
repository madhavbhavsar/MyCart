package com.learn.mycart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.learn.mycart.entities.Bills;

public class BillsDao {
	private SessionFactory factory;
	
	public BillsDao(SessionFactory factory) {
		this.factory = factory;
	}
	
	public List<Bills> getAllBills()
	{
	 Session s=	this.factory.openSession();
	 Query query =s.createQuery("from Bills");
	 List<Bills> list=query.list();
	 return list;

	}
		

}
