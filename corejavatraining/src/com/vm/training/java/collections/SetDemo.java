package com.vm.training.java.collections;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		HashSet hashset=new HashSet();
		hashset.add("Santosh");
		hashset.add("santosh");
		hashset.add("john");
		System.out.println(hashset);
		LinkedHashSet ls=new LinkedHashSet();
		ls.add("Santosh");
		ls.add("Teja");
		ls.add("Santosh");
		ls.add("abc");
		System.out.println(ls);
		
		TreeSet ts=new TreeSet();
		ts.add("Santosh");
		ts.add(ls);
		System.out.println(ts);
		
	}

}
