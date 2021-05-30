package com.vm.training.java.oops;

public class CustomerGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer customer=new Customer();
customer.setId(1001);
customer.setFirstName("Santosh");
customer.setLastName("Teja");
customer.setDepartment("Cse");

System.out.println(customer.getId());
System.out.println(customer.getFirstName());
System.out.println(customer.getLastName());
System.out.println(customer.getDepartment());
	}

}
