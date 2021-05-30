package com.vm.training.java.CollectionsAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class IndianStates {
	static LinkedHashSet<String> link=new LinkedHashSet<String>();
	static int countStates()
	{
		int count=0;
		for(String s: link)
		{
			count++;
		}
		return count;
	}

	static void removeStates()
	{
		link.remove("Delhi");
	}
	static void startWithLetter()
	{
		for(String s: link)
		{
			if(s.startsWith("K"))
			{
				System.out.println(s);
			}
		}
	}
	static void sortedOrder()
	{
		TreeSet<String> ts=new TreeSet<String>(link);
		for(String s:ts)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Lenovo\\Documents\\states.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String readchar=br.readLine();
		while(readchar!=null)
		{
			link.add(readchar);
			readchar=br.readLine();			
		}
	
		
		System.out.println("Number of states are :"+countStates());
		System.out.println("====================");
		System.out.println("Removing delhi from the list :");
		System.out.println("=======================");
		System.out.println("States whose name starts with 'k' ");
		startWithLetter();
		System.out.println("======================");
		System.out.println("Display states in sorted order");
		sortedOrder();
		
		

	}

}
