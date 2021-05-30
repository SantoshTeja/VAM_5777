package com.vm.training.java.date;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.swing.text.DateFormatter;

public class DateFormatterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY/MM/dd");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("YYYY MM dd E W");

		LocalDate today=LocalDate.now();
		String afterformat=today.format(dtf1);
		System.out.println("today date :"+today);
		System.out.println("date after formating :"+afterformat);
		DateTimeFormatter dtfull= DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String fulldate=today.format(dtfull);
		System.out.println("full date: "+fulldate);
		
		DateTimeFormatter dtmedium= DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		String mediumdate=today.format(dtmedium);
		System.out.println("full date: "+mediumdate);
		
		DateTimeFormatter dtshort= DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		String shortdate=today.format(dtshort);
		System.out.println("full date: "+shortdate);
	}

}
