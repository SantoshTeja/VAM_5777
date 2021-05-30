package com.vm.training.java.CollectionsAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TestPatientList implements Comparable<Patient4>{
	static ArrayList arr=new ArrayList();
	static void displayList()
	{
		for(Object o:arr)
		{
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient4 patient1=new Patient4(101,"santosh",23);
		Patient4 patient2=new Patient4(102,"teja",35);
		Patient4 patient3=new Patient4(101,"john",45);
		
		arr.add(patient1);
		arr.add(patient2);
		arr.add(patient3);
		
		System.out.println("++++++After sorting according by name+++++++++");
		Collections.sort(arr,new SortName());
		displayList();
		System.out.println("++++++++After sorting by age+++++++++");
		Collections.sort(arr,new SortAge());
		displayList();
		System.out.println("++++++++The elements in the tree set are+++++++++");
	 
		TreeSet<Object> ar=new TreeSet<Object>();

		ar.add(arr);
	}

	@Override
	public int compareTo(Patient4 o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
