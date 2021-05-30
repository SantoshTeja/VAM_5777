package com.vm.training.java.date;
import java.time.*;
public class DateCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today=LocalDate.now();
		System.out.println("today date :"+today);
		System.out.println("after 1 day :"+today.plusDays(1));
		System.out.println("after 2 weeks :"+today.plusWeeks(2));
		System.out.println("after 1 month :"+today.plusMonths(1));
		System.out.println("after 1 year :"+today.plusYears(1));
		

		
	}

}
