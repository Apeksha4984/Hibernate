package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;


@Entity
public class User {
	@Id
	private int uid;
	private String uName;
	@OneToOne
	  
	private Bank bank;
	public User() {
		super();
		
	}
	public User(int uid, String uName, Bank bank) {
		super();
		this.uid = uid;
		this.uName = uName;
		this.bank = bank;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getuName() {
		return uName;
		
	}
	
	
	public void setuName(String uName) {
		this.uName = uName;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	}
	


