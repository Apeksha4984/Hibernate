package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int empid;
	private String empName;
	private String design;
	
	private Bank bank;
	public Employee() {
		super();
		
	}
	public Employee(int empid, String empName, String design,Bank bank) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.design = design;
		this.bank=bank;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	

}
