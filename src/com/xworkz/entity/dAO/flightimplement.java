package com.xworkz.entity.dAO;

import org.hibernate.cfg.Configuration;

import com.xworkz.entity.FlightEntity;

public class flightimplement  implements  FlightInterface {
	public void save(FlightEntity entity) {
	System.out.println("invoking the entity:"+entity);
	
	Configuration configuration=new Configuration();
	
	configuration.configure();
}
}
