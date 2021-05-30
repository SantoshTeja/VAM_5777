package com.vm.training.java.collections;

import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {
		/*
		HashSet hash=new HashSet();
		hash.add("java");
		hash.add("Santosh");
		hash.add("Teja");
		hash.add("Teja");
		hash.add("abs");
		hash.add("bdc");
		System.out.println(hash);
		*/
		ArrayList<Employee> arraylist=new ArrayList<>();
		arraylist.add(new Employee(100,"Santosh") );
		System.out.println(arraylist);
		ArrayList<EmployeeDetails> array=new ArrayList<>();
		array.add(new EmployeeDetails(100,"Santosh", "Kakinada", "Kakinada"));
		System.out.println(array);
		
		
	}

}
