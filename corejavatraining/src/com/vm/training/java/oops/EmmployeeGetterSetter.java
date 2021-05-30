package com.vm.training.java.oops;

public class EmmployeeGetterSetter {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setDepartment("CSE");
		emp.setId(1001);
		emp.setName("Santosh Teja");
		
		System.out.println(emp.getDepartment());
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
	}

}
