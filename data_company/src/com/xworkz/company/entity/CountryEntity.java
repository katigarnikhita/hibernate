package com.xworkz.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country_details")
public class CountryEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="noOfDistricts")
	private int noOfDistricts;
	@Column(name=" capitalCity")
	private String capitalCity;
	
	public CountryEntity()
	{
		
	}

	public CountryEntity(int id, String name, int noOfDistricts, String capitalCity) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDistricts = noOfDistricts;
		this.capitalCity = capitalCity;
	}

	@Override
	public String toString() {
		return "CountryEntity [id=" + id + ", name=" + name + ", noOfDistricts=" + noOfDistricts + ", capitalCity="
				+ capitalCity + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitalCity == null) ? 0 : capitalCity.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfDistricts;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryEntity other = (CountryEntity) obj;
		if (capitalCity == null) {
			if (other.capitalCity != null)
				return false;
		} else if (!capitalCity.equals(other.capitalCity))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfDistricts != other.noOfDistricts)
			return false;
		return true;
	}
	
	

}
