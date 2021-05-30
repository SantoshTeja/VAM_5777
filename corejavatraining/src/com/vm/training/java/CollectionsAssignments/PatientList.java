package com.vm.training.java.CollectionsAssignments;

import java.util.Comparator;

public class PatientList implements Comparator<Patient>{


	@Override
	public int compare(Patient o1, Patient o2) {
		return o1.getName().compareTo(o2.getName());
		// TODO Auto-generated method stub
	}

}
