package com.vm.training.java.concurrency;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
	    //ConcurrentHashMap<String, Integer> hash=new ConcurrentHashMap<String, Integer>();
		hash.put("santosh", 45);
		hash.put("teja", 44);
		hash.put("mani", 56);
		
		for(Entry<String , Integer> h:hash.entrySet())
		{
			System.out.println(h);
		}
		
		for(Integer i:hash.values())
		{
			System.out.println(i);
		}
		
		for(String str: hash.keySet())
		{
			System.out.println(str);
		}


	}

}
