package com.xworkz.state_entity;

import com.xworkz.state_entity.dao.StateImplements;
import com.xworkz.state_entity.dao.StateInterface;
import com.xworkz.state_entity.entity.StateEntity;

public class StateScanner {

	public static void main(String[] args) {


		StateEntity stateEntity = new StateEntity(1,"karnatka",28,"bangalore");
		
		StateInterface set = new StateImplements();
		
		set.create(stateEntity);

	}

}
