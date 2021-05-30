package com.vm.training.java.collections;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hash=new HashMap();
		hash.put("Santosh","coach");
		hash.put("Santosh","player");
		hash.put("Teja","lead");
		hash.put("john", "cap");
		System.out.println(hash);
		
		LinkedHashMap hash1=new LinkedHashMap();
		hash1.put("Santosh","coach");
		hash1.put("Santosh","player");
		hash1.put("Teja","lead");
		hash1.put("john", "cap");

		System.out.println(hash1);
		

	}

}
