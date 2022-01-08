package com.xworkz.company;

import com.xworkz.company.dao.CompanyDaoimpl;
import com.xworkz.company.dao.CountryDao;
import com.xworkz.company.dao.CountryDaoimpl;
import com.xworkz.company.entity.CompanyEntity;
import com.xworkz.company.entity.CountryEntity;


public class CountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		CountryEntity entity=new CountryEntity();
		entity.setId(02);
	    entity.setName("tcs");
		entity.setNoOfDistricts(28);
		entity.setCapitalCity("Banglore");
		
		CompanyDaoimpl set=new CompanyDaoimpl ();
		set.create(entity);
	 
	
	}


	}


