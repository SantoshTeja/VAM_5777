package com.vm.training.java.CollectionsAssignments;
import java.util.*;
public class TestPatient {
	public static void main(String[] args) {
		
		
		ArrayList<Patient> arr=new ArrayList<Patient>();
		arr.add(new Patient(101,23,"santosh"));
		arr.add(new Patient(102,45,"teja"));
		arr.add(new Patient(103,35,"john"));

		for(Patient p:arr)
		{
			System.out.println(p);
		}
		Collections.sort(arr,new PatientList());
		for(Patient p:arr)
		{
			System.out.println(p);
		}
		
		//System.out.println(arr);

		TreeSet tr=new TreeSet();
		tr.addAll(arr);
		System.out.println(tr);
		
	}

}
