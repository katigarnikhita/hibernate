package com.xworkz.company.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CompanyEntity;
import com.xworkz.company.entity.CountryEntity;

public class CompanyDaoimpl implements CompanyDAO {

	@Override
	public void create(CompanyEntity companyEntity) {
		// TODO Auto-generated method stub
		System.out.println("invoking create dao method");
		System.out.println(companyEntity);
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CompanyEntity.class);
		SessionFactory factory=configuration.buildSessionFactory(); 
		if(factory!=null)
		{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(companyEntity);
		transaction.commit();
		session.close();
		factory.close();
		

		
		
		}

}

}