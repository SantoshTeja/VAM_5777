package com.vm.training.java.collections;

import java.util.Comparator;

public class NameSorting implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return (o1.getName().compareTo(o2.getName()));
	}
	

}
