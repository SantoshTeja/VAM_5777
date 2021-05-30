package com.vm.training.java.date;

import java.time.LocalDate;
import java.time.*;

public class DateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate localdate=LocalDate.now();
		System.out.println("Today date :"+localdate);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("Today date and time :"+datetime);
		
		System.out.println("Day of the year :"+localdate.getDayOfYear());
		System.out.println("Day of the month :"+localdate.getDayOfMonth());
		System.out.println("Year :"+localdate.getYear());
	
	}

}
