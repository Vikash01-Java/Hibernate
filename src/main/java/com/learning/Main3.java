package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learning.config.HibernateConfig1;
import com.learning.entity.Address;
import com.learning.entity.Nokker;

//Association in hibernate
//OneTwoOne single directional mapping

public class Main3 {
	
	public static void getEmps(Session session) {
		Nokker nokker = session.get(Nokker.class, 1);
		System.out.print(nokker);
	}


	public static void save(Session session) {
		
		
		Address a = new Address("noida","up");
		Nokker n = new Nokker();


		
		n.setName("vishal");
		n.setSalary(7868);
		n.setGender("mail");
		n.setAddress(a);
		
		Transaction tx = session.beginTransaction();
		session.persist(n);
		session.persist(a);

		tx.commit();

		
	}
	public static void main(String[] args) {
	
		
//		SessionFactory sf = HibernateConfig1.getSessionFactory();
//		Session session = sf.openSession();
		
	
		Session session =  HibernateConfig1.getSessionFactory().openSession();
//		save(session);
		getEmps(session);
		
		
		
		System.out.print("saved...........");
		
	}


}
