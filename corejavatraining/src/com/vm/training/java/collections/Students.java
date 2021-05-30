package com.vm.training.java.collections;

import java.util.*;
import java.io.*;
public class Students {
public static void main(String[] args) {
	
	System.out.println("Please enter your choice ");
	System.out.println("1. Add student details");
	System.out.println("2. Display student details");
	System.out.println("3. Update student details");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	ArrayList<ArrayList> arr=new ArrayList<ArrayList>();
	String name,gmail;
	int id;
	switch(num)
	{
	case 1:
		ArrayList arr1=new ArrayList();
		System.out.println("Enter student id ");
		id=sc.nextInt();
		System.out.println("Enter student name");
		name=sc.next();
		System.out.println("Enter gmailid");
		gmail=sc.next();
		arr1.add(id);
		arr1.add(name);
		arr1.add(gmail);
		arr.add(arr1);
		System.out.println("Successfull");
		break;
	case 2:
		System.out.println("Details of all the students :");
		for(ArrayList ar:arr)
		{
			System.out.println(ar);
		}
		break;
	case 3:
		System.out.println("Enter student id to update the details");
		id=sc.nextInt();
		
	}
	
}

}
