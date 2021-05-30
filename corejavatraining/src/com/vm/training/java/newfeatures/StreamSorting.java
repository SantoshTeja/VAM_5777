package com.vm.training.java.newfeatures;

import java.util.ArrayList;

public class StreamSorting {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("santosh");
		arr.add("teja");
		arr.add("john");
		arr.add("mary");
	    arr.forEach(System.out::println);
	    System.out.println("============After Sorting===========");
	    arr.stream().sorted().forEach(System.out::println);
	}
}
