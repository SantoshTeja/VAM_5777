package com.vm.training.java.CoreJavaCodingTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.vm.training.java.newfeatures.Employee;

import java.io.*;

public class WWEWrestlerImplementation {
	static ArrayList<WWE> arraylist=new ArrayList<WWE>();

	static long countWrestlers()
	{
		long count=arraylist.stream().count();
		return count;
	}
	static long sumOfWeight()
	{
	    long sum=arraylist.stream().filter(s->s.getWeight()>200).collect(Collectors.summarizingInt(WWE:: getWeight)).getSum();

	    return sum;
	}
	static List printFirstName()
	
	{
		return (List) arraylist.stream().map(s->s.getFirstName()).collect(Collectors.toList());
	}
	static List sortFirstName()
	{
		return 	(List) arraylist.stream().sorted(Comparator.comparing(WWE::getFirstName)).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylist.add(new WWE("santosh","Teja",345));
		arraylist.add(new WWE("john","cena",300));
		arraylist.add(new WWE("roman","reigns",210));
		arraylist.add(new WWE("brock","lesnar",290));
		arraylist.add(new WWE("randy","orton",190));
	    System.out.println("Number of wrestlers are : "+countWrestlers());
	    
	    System.out.println("=====================");
	    System.out.println("Sum of all wrestles whose weight is >200 is :"+ sumOfWeight());
	    System.out.println("===================");
	    System.out.println("The First name of all the wrestlers are :");
	    List ar=printFirstName();
	    ar.stream().forEach(s->System.out.println(s));
	    System.out.println("====================");
	    System.out.println("After sorting by First name :");
	    List ar1=sortFirstName();
	    ar1.stream().forEach(s->System.out.println(s));
	    
	    
	    
	    
	    
		

	}

}
