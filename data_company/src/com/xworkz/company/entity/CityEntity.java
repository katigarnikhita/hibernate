package com.xworkz.company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")

public class CityEntity implements Serializable {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="population")
	private long population;
	@Column(name="FamousFor")
	private String FamousFor;
	
	CityEntity()
	{
		
	}

	public CityEntity(int id, String name, long population, String famousFor) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		FamousFor = famousFor;
	}

	@Override
	public String toString() {
		return "CityEntity [id=" + id + ", name=" + name + ", population=" + population + ", FamousFor=" + FamousFor
				+ "]";
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

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getFamousFor() {
		return FamousFor;
	}

	public void setFamousFor(String famousFor) {
		FamousFor = famousFor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FamousFor == null) ? 0 : FamousFor.hashCode());
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
		CityEntity other = (CityEntity) obj;
		if (FamousFor == null) {
			if (other.FamousFor != null)
				return false;
		} else if (!FamousFor.equals(other.FamousFor))
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