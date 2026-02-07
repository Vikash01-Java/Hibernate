 package com.learning.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

//Association in hibernate
//OneTwoOne by directional mapping

public class HibernateConfig2 {

	
	public static SessionFactory getSessionFactory() {
        Properties p = new Properties();

		p.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        p.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/Medical");
        p.put(Environment.JAKARTA_JDBC_USER, "root");
        p.put(Environment.JAKARTA_JDBC_PASSWORD, "Root");
        p.put(Environment.HBM2DDL_AUTO, "update");
        p.put(Environment.SHOW_SQL, true);
        p.put(Environment.FORMAT_SQL, true);
        
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(p).build();
//		MetadataSources meta	=new MetadataSources(ssr).addAnnotatedClasses(com.learning.entity.Investor.class,com.learning.entity.InvestAdd.class);
//      SessionFactory sessionFactory = meta.buildMetadata().buildSessionFactory();

      return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(p).build())
				.addAnnotatedClasses(com.learning.entity.Investor.class,com.learning.entity.Address1.class).buildMetadata().buildSessionFactory();



		
		
		
		
		
	}
}
