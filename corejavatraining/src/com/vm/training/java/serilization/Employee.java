package com.vm.training.java.serilization;

import java.io.Serializable;

public class Employee implements Serializable{
int id;
String name;
transient static String dept;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
