package com.xworkz.Runner;

import com.xworkz.entity.FlightEntity;
import com.xworkz.entity.dAO.FlightInterface;
import com.xworkz.entity.dAO.flightimplement;

public class FlightRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightEntity entity=new FlightEntity();
		entity.setF_id(1);
		entity.setF_name("rajiv gandi airport");
		entity.setF_source("air india");
		entity.setF_destination("Banglore");
		FlightInterface flightEntity=new flightimplement();
		flightEntity.save(entity);
		
	}

}
