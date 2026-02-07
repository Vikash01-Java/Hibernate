package com.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.learning.config.HibernateConfig2;
import com.learning.entity.Address1;
import com.learning.entity.Investor;

//Association in hibernate
//OneToOne by directional mapping
public class Main4 {

    public static void getEmps(Session session) {
        Investor inv = session.get(Investor.class, 2);
        System.out.println(inv);
      System.out.println(inv.getAddress1());

    }

    public static void getAdd(Session session) {
//    	Address1 add = session.get(Address1.class, 2);  //its deprecated
//      System.out.println(add);
//    	  or
    	Address1 add = new Address1();
    	session.load(add, 2);
        System.out.println(add);
      System.out.println(add.getInvestor());

    }
    
    public static void save(Session session) {
    
		Address1 a = new Address1("delhi", "UP");
        Investor i = new Investor("raam", "Male", 8868, a);
		a.setInvestor(i);

        Transaction tx = session.beginTransaction();    
        session.persist(i);    // Address saved automatically    
        session.persist(a);
        tx.commit();
    }
    public static void main(String[] args) {
        SessionFactory sf = HibernateConfig2.getSessionFactory();
        Session session = sf.openSession();

        save(session);
        getEmps(session);
//        getAdd(session);


        session.close();
        sf.close();
        System.out.println("Done successfully...");
    }
}