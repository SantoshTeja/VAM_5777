package com.vm.training.java.collections;

public class EmployeeDetails extends Employee{
    String address,location;

	public EmployeeDetails(int id, String name, String address, String location) {
		super(id, name);
		this.address = address;
		this.location = location;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [address=" + address + ", location=" + location + "]";
	}

	
	
	

}
