package com.vm.training.java.practice;

import java.util.Comparator;

public class SortName implements Comparator<Patient4>{

	@Override
	public int compare(Patient4 o1, Patient4 o2) {
		// TODO Auto-generated method stub

		return o1.getName().compareTo(o2.getName());
	}

}
