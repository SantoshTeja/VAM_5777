package com.vm.training.java.concurrency;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapDemo {
public static void main(String[] args) {
	//HashMap<String,Integer> hash=new HashMap<String,Integer>();
    ConcurrentHashMap<String, Integer> hash=new ConcurrentHashMap<String, Integer>();
	hash.put("santosh", 45);
	hash.put("teja", 44);
	hash.put("mani", 56);
	
	System.out.println("Elements are: "+hash);
	
	//hash.computeIfPresent("santosh",a->34);
	//System.out.println(hash.containsValue(67));
	//System.out.println(hash.containsKey("santosh"));
	//System.out.println(hash.containsValue(44));
	//System.out.println(hash.containsValue(56));
	System.out.println("Elements present are :"+hash);
	
	for(Integer h:hash.values())
	{
		System.out.println(h);
		hash.computeIfAbsent("john", a->67);

	}
	
	System.out.println(hash);
}
}
