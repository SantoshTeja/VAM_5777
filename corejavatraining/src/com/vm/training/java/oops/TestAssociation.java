package com.vm.training.java.oops;

public class TestAssociation {
public static void main(String[] args) {
	TestAssociation test=new TestAssociation();
	//test.showAggregation();
	test.showComposition();
	
}
static void showAggregation()
{
	
	Address address=new Address();
	address.setCity("Kakinada");
	address.setCountry("India");
	address.setState("AP");
	
	Employ emp=new Employ();
	emp.setId(101);
	emp.setName("Santosh");
	emp.setDept("CSE");
	emp.setAddress(address);
	
	System.out.println(emp);
	System.out.println("-------------------------------");
	emp=null;
	System.out.println(emp);
	System.out.println(address);
	
}
static void showComposition()
{
	Person per=new Person();
	per.setId(101);
	per.setName("Santosh");
	per.getAddress().setCity("Kakinada");
	per.getAddress().setState("AP");
	per.getAddress().setCountry("India");
	
	System.out.println(per);
}
}
