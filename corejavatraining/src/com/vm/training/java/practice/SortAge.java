package com.vm.training.java.practice;

import java.util.Comparator;

public class SortAge implements Comparator<Patient4>{

	@Override
	public int compare(Patient4 o1, Patient4 o2) {
		
		
		if(o1.getAge()==o2.getAge())
		{
			return 0;
		}
		else if(o1.getAge()>o2.getAge())
		{
			return 1;
		}
		else
		{
			return -1;
		}	// TODO Auto-generated method stub
	}

}
