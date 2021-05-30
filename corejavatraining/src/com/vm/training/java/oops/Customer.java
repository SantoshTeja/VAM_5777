package com.vm.training.java.oops;

public class Customer {
	
	protected int id;
	private String firstName;
	private String lastName;
	private String department;
	
	public Customer()
	{
		
	}
/*
	public Customer(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
		System.out.println(id+" "+firstName);
	}

	public Customer(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println(id+" "+firstName+" "+lastName);
	}

	public Customer(int id, String firstName, String lastName, String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public Customer(int id) {
		super();
		this.id = id;
		System.out.println(id);
	}
	
	/*public Customer(int id,String firstName,String lastName,String department)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=department;
		
	}
	public void show()
	{
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(department);
	}
	/*
	 * \*
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
}
