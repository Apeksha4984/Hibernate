package com.hibernate.FirstHibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeBean {
	@Id@GeneratedValue(strategy = GenerationType.SEQUENCE)
	  
	private int id;
	private String name;
	public EmployeeBean() {
		super();
	}
	

	public EmployeeBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

}
