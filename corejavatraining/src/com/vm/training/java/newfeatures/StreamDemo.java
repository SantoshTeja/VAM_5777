package com.vm.training.java.newfeatures;

import java.util.ArrayList;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(6);
		
		arr.forEach(s ->System.out.println(s));
		
		long count=arr.stream().count();
		System.out.println("count is :"+count);
		
		arr.stream().filter(s->s>2).forEach(p-> System.out.println(p));
		
		arr.stream().map(s->s+100).forEach(p->System.out.println(p));
	}

}
