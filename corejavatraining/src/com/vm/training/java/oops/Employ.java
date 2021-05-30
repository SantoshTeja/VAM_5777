package com.vm.training.java.oops;

public class Employ {
	int id;
	String name;
	String dept;
	Address address;
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
