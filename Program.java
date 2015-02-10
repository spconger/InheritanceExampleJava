package com.spconger.InheritanceExample;

public class Program {
	public static void main(String[] args)
	{
		Customer c = new Customer();
		c.setName("Steve");
		c.setEmail("Steve@spconger.com");
		c.setPhone("2065552122");
		c.setZipCode("98122");
		c.setRegistrationDate("2/9/2015");
		
		System.out.println(c.toString());
		
		HourlyEmployee he = new HourlyEmployee();
		he.setDept("IT");
		he.setName("George");
		he.setEmployeeID(25);
		he.setHireDate("2/9/2015");
		he.setRateOfPay(5);
		he.setHours(160);
		he.setEmail("g@gmail.com");
		he.setPhone("2065551234");
		
		System.out.println(he.toString());
		
		
		
	}
}
