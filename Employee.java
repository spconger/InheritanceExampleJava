package com.spconger.InheritanceExample;

public abstract class Employee extends Person {
	//private fields
	private int employeeID;
	private String hireDate;
	private String dept;
	
	//public getters and setters
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	//public method
	public abstract double calculateMonthlyPay();
	
	public String toString(){
		String parentString = super.toString();
		return Integer.toString(getEmployeeID()) + ", "
				+ getHireDate() + ", " + getDept() + parentString;
	}
	
	
}
