package com.xworkz.entity;

import java.io.Serializable;
import java.lang.annotation.Native;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;


@Entity
@Table(name="flight_details")
public class FlightEntity implements Serializable {

 @Id
 @Column(name="f_id")
 private int f_id;
 @Native
 
 @Column(name="f_name")
 private String f_name;
 
 @Column(name="f_destination")
 private String f_destination;

 @Column(name="f_source")
 private String f_source;
 
 
 public FlightEntity()
 {
	 
 }





public FlightEntity(int f_id, String f_name, String f_destination, String f_source) {
	super();
	this.f_id = f_id;
	this.f_name = f_name;
	this.f_destination = f_destination;
	this.f_source = f_source;
}


public int getF_id() {
	return f_id;
}


public void setF_id(int f_id) {
	this.f_id = f_id;
}


public String getF_name() {
	return f_name;
}


public void setF_name(String f_name) {
	this.f_name = f_name;
}


public String getF_destination() {
	return f_destination;
}


public void setF_destination(String f_destination) {
	this.f_destination = f_destination;
}


public String getF_source() {
	return f_source;
}


public void setF_source(String f_source) {
	this.f_source = f_source;
}
@Override
public String toString() {
	return "FlightEntity [f_id=" + f_id + ", f_name=" + f_name + ", f_destination=" + f_destination + ", f_source="
			+ f_source + "]";
}
 

}
