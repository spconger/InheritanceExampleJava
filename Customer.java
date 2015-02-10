package com.spconger.InheritanceExample;

public class Customer extends Person {
	//extends is the key word for
	//inheritance
	
	//private fields
	private int customerNo;
	private String registrationDate;
	private String zipCode;
	private int discountPoints;
	
	//public setters and getters
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public int getDiscountPoints() {
		return discountPoints;
	}
	public void setDiscountPoints(int discountPoints) {
		this.discountPoints = discountPoints;
	}
	
	public double calculateDiscount(double amount)
	{
		//stupid calculation but something
		double discount  = amount - getDiscountPoints();
		return discount;
	}
	
	
	public String toString(){
		String parentString = super.toString();
		return getCustomerNo() + "--" + getRegistrationDate() 
				+ ", " + parentString;
	}
}
	
	

