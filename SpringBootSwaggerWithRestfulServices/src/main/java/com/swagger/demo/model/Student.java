package com.swagger.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int sId;
	
	private String sName;
	private int rollNo;
	private String std;
	private double fees;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", rollNo=" + rollNo + ", std=" + std + ", fees=" + fees
				+ "]";
	}
	
	
}
