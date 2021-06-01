package com.vm.training.java.CoreJavaCodingTest;
import java.util.*;
public class Employee {
	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name :");
		String firstname=sc.next();
		System.out.println("Enter last name :");
		String lastName=sc.next();
		
		try
		{
			if(firstname.isEmpty()&& lastName.isEmpty())
			{
				throw new NullPointerException("Entry missing");
			}
			if(firstname.length()<=3&&lastName.length()<=3)
			{
				throw new Exception("Please enter atleast 3 characters");
			}
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}

}
