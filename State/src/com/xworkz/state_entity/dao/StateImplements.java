package com.xworkz.state_entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.state_entity.entity.StateEntity;

public class StateImplements implements StateInterface{

	@Override
	public void create(StateEntity stateEntity) {

		System.out.println("invoking create dao method");
		System.out.println(stateEntity);
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(StateEntity.class);
		SessionFactory factory=configuration.buildSessionFactory(); 
		if(factory!=null)
		{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(stateEntity);
		transaction.commit();
		session.close();
		
		}
		factory.close();
	}

}
