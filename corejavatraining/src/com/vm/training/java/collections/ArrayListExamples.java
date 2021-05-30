package com.vm.training.java.collections;

import java.util.*;
public class ArrayListExamples {
public static void main(String[] args) {
	ArrayList<String> javabatch=new ArrayList<String>();
	javabatch.add("ravi");
	javabatch.add("john");
	javabatch.add("anil");
	javabatch.add("kumar");
	
	ArrayList<String> sqlbatch=new ArrayList<String>();
	sqlbatch.add("sourabh");
	sqlbatch.add("ankita");
	sqlbatch.add("john");
	sqlbatch.add("kumar");
	sqlbatch.add("manoj");
	
	/*ArrayList<String> batch=new ArrayList<String>();
	batch.addAll(javabatch);
	for(String arr: sqlbatch)
	{
		if(!javabatch.contains(arr))
		{
			batch.add(arr);
		}
	}
	Collections.sort(batch);
	System.out.println(batch);
	*/
	javabatch.removeAll(sqlbatch);
	javabatch.addAll(sqlbatch);
	Collections.sort(javabatch);
	System.out.println(javabatch);
	
	
}
}
