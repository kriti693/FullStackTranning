package com.yash.oops;

import java.util.Date;
/*
 * Create a person class and their member private and create getter and setter
 */
class Person {
	private int pid;
	private String pName;
	private String pAddress;
	private Date DOB;

	public int getPid() {
		return pid;
	}

	public String getpName() {
		return pName;
	}

	public String getpAddress() {
		return pAddress;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

}
/*
 * Create a department class 
 */
class Department{
	int deptId;
	String depName;
}
/*
 * Create a employee class 
 */
class Employee{
	  long salary;
	  Date DOJ;
	  String baseLocation;
	  Department deptobj;
	  int contactNo;
	  String emailId;
}
class Customer extends Person{
	
}
public class Question1 {

}
