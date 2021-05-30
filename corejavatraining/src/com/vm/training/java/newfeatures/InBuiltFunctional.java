package com.vm.training.java.newfeatures;

import java.util.function.Predicate;

public class InBuiltFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p=(var1)->var1>2;
		System.out.println(p.test(3));
		Predicate<String> p2=(v1)->v1.startsWith("a");
		System.out.println(p2.test("apple"));
		//Function<String,String> f1= (var) -> 
	}

}
