package com.vm.training.java.concurrency;
import java.util.*;
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	System.out.println("Elements are :");
	for(Object o:arr)
	{
		System.out.println(o);
		arr.add(4);
	}
}
}
