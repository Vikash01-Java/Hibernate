package com.learning;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.learning.config.HibernateConfig;
import com.learning.entity.Student;

public class Main2 {
//	static Metadata meta=null;
//	public static SessionFactory getSessionFactory(){
//
//		 return new MetadataSources( new StandardServiceRegistryBuilder().configure().build())
//		 .getMetadataBuilder().build().buildSessionFactory();
//			
//	}

	public static void main(String[] args) {
       Student s = new Student("vikas","male",80000);
// 1     
//       Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//       SessionFactory  sessionFactory  = cfg.buildSessionFactory();
//       Session session =sessionFactory.openSession();
//       Transaction tx = session.beginTransaction();
//       session.persist(s);
//       tx.commit();
		
		
// 2      
////    StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure().build();
////	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//      SessionFactory  sessionFactory  = meta.buildSessionFactory();
//      Session session =sessionFactory.openSession();
//      Transaction tx = session.beginTransaction();
//      session.persist(s);
//      tx.commit();
       
       
      SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
//		FOR SAVE DATA  :- save is deprecated now is persist will work.
//		session.persist(s);
//		tx.commit();
//	-----------------------------------------------------------------------------	
//		FOR GET DATA BY ID :- get is deprecated now is load will work.
//		
	       Student st = new Student();
	       session.load(st, 3);
////	             or
	       Student st1 = session.find(Student.class, 5);
	       
	       System.out.println(st);
	       System.out.println(st1);
//-------------------------------------------------------------------------------
//		HQL:-Work for database no need to change the sql query for the different-different database 
//		Select all records
		
		Query query = session.createQuery("from Student");
		List list = query.list();
		System.out.println(list);
		tx.commit();
//
//--------------------------------------------------------------------------------		
//           HQL to get records with pagniation 
		
//		Query query = session.createQuery("from Student");
//		query.setFirstResult(2);
//		query.setMaxResults(4);
//		List list = query.list();
//		System.out.println(list);
//		tx.commit();

//		shows 3,4,5,6 
//---------------------------------------------------------------------------------
//		HQL Update query
//		Query query = session.createQuery("update Student set name = :name, gender = :gender ,salary = :salary where id = :id");		
//		query.setParameter("name", "saloni");
//		query.setParameter("gender", "female");
//		query.setParameter("id", "7");
//		query.setParameter("salary", "700000");
//
//		int rows = query.executeUpdate();
//		tx.commit();
//
//		System.out.println(rows + " record(s) updated.");
//---------------------------------------------------------------------------------
//		HQL Delete query
//		Query query = session.createQuery("delete from Student where id=:id");
//		query.setParameter("id", "7");
//		query.executeUpdate();
//		tx.commit();
//---------------------------------------------------------------------------------	
//		Aggregate function:-avg(),min(),max(),sum(),count()
		
//		Query query = session.createQuery("select max(name) from Student");
//		System.out.println(query.list());
//		tx.commit();
//---------------------------------------------------------------------------------
//		find student by name with the named query
//		Query nameQuery = session.createNamedQuery("findStuByName", Student.class);
//		nameQuery.setParameter("name", "saloni");
//
//		List list = nameQuery.getResultList();
//		System.out.println(list);
//
//		tx.commit();
//		session.close();
//-----------------------------------------------------------------------------------		
		
//		Query nameQuery = session.createNamedQuery("findStu");
//		
//		List list = nameQuery.list();
//		System.out.println(list);
//
//		tx.commit();

		

		
       
	}

}
