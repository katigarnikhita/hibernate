package com.xworkz.company;

import com.xworkz.company.dao.CityDao;
import com.xworkz.company.dao.CityDaoImpl;
import com.xworkz.company.entity.CityEntity;

public class CityRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CityEntity city=new CityEntity(01,"hubli",500000,"lake");
		
		CityDao set =new CityDaoImpl();
		set.create(city);
}
}