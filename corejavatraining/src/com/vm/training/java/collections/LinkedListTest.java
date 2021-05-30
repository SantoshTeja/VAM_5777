package com.vm.training.java.collections;

import java.util.*;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<String>();
		link.add("Santosh");
		link.addFirst("Talatam");
		link.add("Teja");
		link.addLast("Kakinada");
		link.add(3,"Lives in");
		System.out.println(link);
		for(String str: link)
		{
			System.out.print(str+" ");
		}
		System.out.println();
		ArrayList<ArrayList> arr=new ArrayList<ArrayList>();
		ArrayList arr1=new ArrayList();
		arr1.add("Santosh");
		arr1.add("Teja");
		arr1.add(23);
		arr1.add("Kakinada");
		arr.add(arr1);
		ArrayList arr2=new ArrayList();
		arr2.add("Mani");
		arr2.add("Teja");
		arr2.add(22);
		arr2.add("Hyderabad");
		arr.add(arr2);
        for(ArrayList s:arr)
        {
        	System.out.println(s);
        }
		
		//System.out.println(arr);
	}

}
