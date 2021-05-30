package com.vm.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorWrestler {
	public static void main(String[] args) {
		ArrayList<Wrestler> wrestler=new ArrayList<Wrestler>();
		wrestler.add(new Wrestler("Santosh",6.2,105));
		wrestler.add(new Wrestler("Teja",5.9,98));
		wrestler.add(new Wrestler("Mani",6.0,120));
		
		for(Wrestler wrestle: wrestler)
		{
			System.out.println(wrestle);
		}
		System.out.println("==============After Height Sorting==============");
		Collections.sort(wrestler, new HeightSorting());
		for(Wrestler wrestle: wrestler)
		{
			System.out.println(wrestle);
		}
		

		
	}

}
