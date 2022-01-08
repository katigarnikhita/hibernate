package com.xworkz.state_entity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" country")
public class CountyEntity {
	
    @Id
    @Column(name="id")
	private int id;
    @Column(name="name")
	private String name;
    @Column(name="contient")
	private String contient;
    @Column(name="population")
	private long population;
	
	CountyEntity()
	{
		
	}

	public CountyEntity(int id, String name, String contient, long population) {
		super();
		this.id = id;
		this.name = name;
		this.contient = contient;
		this.population = population;
	}

	@Override
	public String toString() {
		return "CountyEntity [id=" + id + ", name=" + name + ", contient=" + contient + ", population=" + population
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

	public String getContient() {
		return contient;
	}

	public void setContient(String contient) {
		this.contient = contient;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contient == null) ? 0 : contient.hashCode());
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
		CountyEntity other = (CountyEntity) obj;
		if (contient == null) {
			if (other.contient != null)
				return false;
		} else if (!contient.equals(other.contient))
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
