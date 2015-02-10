package com.spconger.InheritanceExample;

public class HourlyEmployee extends Employee{

	private double rateOfPay;
	private int hours;
	private String status;
	
	//overriden abstract method
	@Override
	public double calculateMonthlyPay() {
		
		return getRateOfPay() * getHours();
	}
	
	public String toString(){
		String parentString = super.toString();
		return parentString + ", Monthly Pay: " 
				+ Double.toString(calculateMonthlyPay());
	}

	//public getters and setters
	public double getRateOfPay() {
		return rateOfPay;
	}

	public void setRateOfPay(double rateOfPay) {
		this.rateOfPay = rateOfPay;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
