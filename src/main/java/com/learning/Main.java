package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Employee;

public class Main {
	

	public static void main(String[] args) {
		Employee e = new Employee(4,"Nick","male",50000);
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(e);
		tx.commit();
		
		
		
	}

}
