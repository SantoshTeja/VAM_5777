package com.vm.training.java.collections;

import java.util.Comparator;

public class PriceSorting implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getPrice()==o2.getPrice())
		{
			return 0;
		}
		else if(o1.getPrice()>o2.getPrice())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		// TODO Auto-generated method 
	}

}