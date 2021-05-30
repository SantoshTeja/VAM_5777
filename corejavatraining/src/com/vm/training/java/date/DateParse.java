package com.vm.training.java.date;

import java.time.LocalDate;
import java.util.Locale;

public class DateParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stratDate="2021-05-29";
		LocalDate ld=LocalDate.parse(stratDate);
		System.out.println(stratDate);
		System.out.println(ld);
	}

}
