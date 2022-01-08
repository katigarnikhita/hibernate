package com.xworkz.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CompanyEntity;
import com.xworkz.company.entity.CountryEntity;

public class CountryDaoimpl implements  CompanyDAO {

	public void create(CompanyEntity countryentity) {
		// TODO Auto-generated method stub
		System.out.println("invoking create dao method");
		System.out.println(countryentity);
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CountryEntity.class);
		SessionFactory factory=configuration.buildSessionFactory(); 
		if(factory!=null)
		{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(countryentity);
		transaction.commit();
		session.close();
		factory.close();
		

		
		
		}

}
	}


