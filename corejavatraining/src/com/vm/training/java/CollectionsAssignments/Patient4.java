package com.vm.training.java.CollectionsAssignments;

import java.util.Comparator;

public class Patient4{
	
	private int patientId;
	private String name;
	private int age;
	public Patient4(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient4 [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}

	}
	