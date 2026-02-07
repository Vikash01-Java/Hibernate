package com.learning;
//ANNOTATION
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learning.entity.Car;

public class Main1 {

	public static void main(String[] args) {
		Car c = new Car("BMW", "black", 6505); 
//Configuration cfg = new Configuration().configure("hibernate.cfg1.xml");
		
//		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg1.xml").buildSessionFactory();
        
//		Session session = new Configuration().configure("hibernate.cfg1.xml").buildSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(c);
//		tx.commit();

		
    StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("hibernate.cfg1.xml").build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
      SessionFactory  sessionFactory  = meta.buildSessionFactory();
      Session session =sessionFactory.openSession();
      Transaction tx = session.beginTransaction();
      session.persist(c);
      tx.commit();
}
}