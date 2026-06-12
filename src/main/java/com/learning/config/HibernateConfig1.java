package com.learning.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

//Association in hibernate
//OneTwoOne single directional mapping


public class HibernateConfig1 {

	public static SessionFactory getSessionFactory(){
		
         Properties ps = new Properties();
		
		
		ps.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		ps.put(Environment.JAKARTA_JDBC_URL,"jdbc:mysql://localhost:3306/dukan");
		ps.put(Environment.JAKARTA_JDBC_USER,"root");
		ps.put(Environment.JAKARTA_JDBC_PASSWORD,"Root");
		ps.put(Environment.HBM2DDL_AUTO,"update");
		ps.put(Environment.SHOW_SQL,true);
		ps.put(Environment.FORMAT_SQL,true);
		
		StandardServiceRegistry ssrr = new StandardServiceRegistryBuilder().applySettings(ps).build();
		MetadataSources meta	=new MetadataSources(ssrr).addAnnotatedClass(com.learning.entity.Nokker.class);
        SessionFactory sessionFactory1 = meta.buildMetadata().buildSessionFactory();
		return sessionFactory1;
		       //or
//		return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(ps).build())
//				.addAnnotatedClasses(com.learning.entity.Nokker.class,com.learning.entity.Address.class).buildMetadata().buildSessionFactory();
//

	}

	
}
