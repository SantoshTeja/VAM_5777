package com.vm.training.java.oops;

public class EmployeeDetails extends Employee{
	

String email;
String mobile;
String address;



	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public String toString()
	 {
		 return id+"  "+name+"  "+department+"  "+email+"  "+mobile+"  "+address;
	 }

	public EmployeeDetails(int id, String name, String department,String email,String mobile,String address) {
		/*super(id, name, department);*/
		this.email=email;
		this.mobile=mobile;
		this.address=address;
	}
	public static void main(String[] args) {
		EmployeeDetails empdet=new EmployeeDetails(101,"santosh","cse","saisa@gmail.com","2134134","kakinada");
		System.out.println(empdet);
		
	}
}
