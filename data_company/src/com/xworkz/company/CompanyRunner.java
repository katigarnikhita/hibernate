package com.xworkz.company;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dao.CompanyDaoimpl;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyEntity companyEntity=new CompanyEntity();
		companyEntity.setId(02);
		companyEntity.setName("tcs");
		companyEntity.setDomain("developement");
		companyEntity.setWebsite("www.tcs.com");
		
		CompanyDAO companyDAO=new  CompanyDaoimpl();
		companyDAO.create(companyEntity);
		
	
	}

}
