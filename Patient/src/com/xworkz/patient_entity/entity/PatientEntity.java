package com.xworkz.patient_entity.entity;



public class PatientEntity  {
	
	private int id;
	private String name;
	private int birthPlace;
	private int age;
	private int bedNo;
	 PatientEntity  ()
	 {
		 
	 }
	public PatientEntity(int id, String name, int birthPlace, int age, int bedNo) {
		super();
		this.id = id;
		this.name = name;
		this.birthPlace = birthPlace;
		this.age = age;
		this.bedNo = bedNo;
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
	public int getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(int birthPlace) {
		this.birthPlace = birthPlace;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBedNo() {
		return bedNo;
	}
	public void setBedNo(int bedNo) {
		this.bedNo = bedNo;
	}
	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", name=" + name + ", birthPlace=" + birthPlace + ", age=" + age + ", bedNo="
				+ bedNo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + bedNo;
		result = prime * result + birthPlace;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		PatientEntity other = (PatientEntity) obj;
		if (age != other.age)
			return false;
		if (bedNo != other.bedNo)
			return false;
		if (birthPlace != other.birthPlace)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	 
	
}
	