package com.vm.training.java.oops;

public class Employee {
	 int id;
	String name;
	String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	/*
	Employee()
	{
		
	}
	
	 Employee(int id,String name,String department)
	{
		this.id=id;
		this.name=name;
		this.department=department;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(department);
	}
	/*
	 public String toString()
	 {
		 return id+"  "+name+"  "+department;
	 }
	 public static void main(String args[])
	 {
		 Employee emp=new Employee();
		 Employee emp1=new Employee(101,"Santosh","cse");
		 System.out.println(emp);
		 System.out.println(emp1);
		 
		 
	 }
	 */

}
