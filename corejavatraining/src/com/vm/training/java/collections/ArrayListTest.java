package com.vm.training.java.collections;

import java.util.*;
public class ArrayListTest {
public static void main(String[] args) {
	/*
	ArrayList arraylist=new ArrayList();
	arraylist.add(new Integer(20));
	arraylist.add("Santosh");
	arraylist.add("Teja");
	arraylist.add(new Float(20.38));
	System.out.println(arraylist);
	arraylist.remove(2);
	System.out.println(arraylist);
	arraylist.add(2, "Teja");
	System.out.println(arraylist);
	System.out.println(arraylist.contains("Santosh"));
	System.out.println(arraylist.get(2));
	ArrayList arr=(ArrayList) arraylist.clone();
	System.out.println(arr);
	Collections.shuffle(arraylist);
	System.out.println(arraylist);
	Collections.emptyList();
	System.out.println(arraylist);
	*/
	Map map=new HashMap();
	map.put(100,"java");
	System.out.println(map);
	
	ArrayList<String> arr=new ArrayList<>();
	arr.add("java");
	arr.add("Santosh");
	String s=arr.get(1);
	System.out.println(s);
	
	
}
}
