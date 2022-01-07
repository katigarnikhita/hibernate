package com.xworkz.entity.dAO;


import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.FlightEntity;

public class flightimplement  implements  FlightInterface {
	private static final String SessionFactory = null;

	public void save(FlightEntity entity) {
	System.out.println("invoking the entity:"+entity);
	
	Configuration configuration=new Configuration();
	
	configuration.configure("hibernate.cfg.xml");
	configuration.addAnnotatedClass(FlightEntity.class);
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();
    Transaction tx= session.beginTransaction();
	session.save(entity);
	tx.commit();
	session.close();
	factory.close();
	
	
	
	
	
	
	
	
}
}
