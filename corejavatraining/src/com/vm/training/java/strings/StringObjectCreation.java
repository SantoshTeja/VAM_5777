package com.vm.training.java.strings;

import java.util.Scanner;

public class StringObjectCreation {
public static void main(String[] args) {
	String s1=new String("      Value     Momentum    ");
	String s2="Value Momentum";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	s1=s1.concat("Santosh");
	System.out.println(s1.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.indexOf(1,3));
	System.out.println(s1.isEmpty());
	System.out.println(s1.replace(s2, s1));
	
	String s3="Aa";
	String s4="Aabb";
	System.out.println(s3.compareTo(s4));
	System.out.println(s1.substring(2,5));
	System.out.println(s1.compareToIgnoreCase(s2));
	System.out.println(s1.trim());
	System.out.println(s1.replaceAll(" ",""));
	System.out.println(s1.replace('a', 'b'));
	/*
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s5=sc.nextLine();
	System.out.println("Enter the word to search");
	String s6=sc.next();
	int len=s5.length();
	int count=0;
	for(int i=0;i<=len-s6.length();i++)
	{
		if(s5.charAt(i)==s6.charAt(0))
		{
			if(s5.substring(i,i+s6.length()).compareTo(s6)==0)
			{
				count++;
			}
		}
	}
	System.out.println(count);
	sc.close();
	*/
	System.out.println(s1.endsWith(s2));
}
}
