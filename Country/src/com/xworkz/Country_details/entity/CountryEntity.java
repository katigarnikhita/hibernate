package com.xworkz.Country_details.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country")

public class CountryEntity  implements Serializable{
	@Id
	@Column(name = "id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="containts")
	private String containts;
	@Column(name="population")
	private long population;
	
	public CountryEntity()
	{
		
	}

	public CountryEntity(int id, String name, String containts, long population) {
		super();
		this.id = id;
		this.name = name;
		this.containts = containts;
		this.population = population;
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

	public String getContaints() {
		return containts;
	}

	public void setContaints(String containts) {
		this.containts = containts;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "CountryEntity [id=" + id + ", name=" + name + ", containts=" + containts + ", population=" + population
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((containts == null) ? 0 : containts.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (population ^ (population >>> 32));
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
		if (containts == null) {
			if (other.containts != null)
				return false;
		} else if (!containts.equals(other.containts))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		return true;
	}
	
}
