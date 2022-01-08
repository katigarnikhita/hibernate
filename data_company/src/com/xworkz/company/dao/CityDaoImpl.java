package com.xworkz.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CityEntity;

public class CityDaoImpl implements CityDao {

	@Override
	public void save(CityEntity cityentity) {
		// TODO Auto-generated method stub
		System.out.println("ivoking save method");
		System.out.println(cityentity);
		Configuration configuration=new Configuration ();
		configuration.configure();
		configuration.addAnnotatedClass(CityEntity.class);
		SessionFactory  factory= configuration.buildSessionFactory();
		if(factory!=null)
		{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save( cityentity );
		transaction.commit();
		session.close();
		factory.close();
		
	
	}
	
}

	@Override
	public void create(CityEntity city) {
		// TODO Auto-generated method stub
		
	}


}