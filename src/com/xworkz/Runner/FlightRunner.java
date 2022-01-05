package com.xworkz.Runner;

import com.xworkz.entity.FlightEntity;
import com.xworkz.entity.dAO.FlightInterface;
import com.xworkz.entity.dAO.flightimplement;

public class FlightRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightInterface flightEntity=new flightimplement();
		flightEntity.save(new FlightEntity());
	}

}
