package com.vm.training.java.io;

import java.io.*;
import java.util.*;
public class DisplayEvenNumbers {

public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("C:\\Users\\Lenovo\\Documents\\santosh.txt");
	BufferedReader br=new BufferedReader(fr);
   String row;
	// String str=br.readLine();
    //System.out.println(str)
   Scanner sc=new Scanner(fr);
   String st="";
   while(sc.hasNextLine())
   {
	   st+=sc.nextLine();
   }
	     String[] data = st.split(",");
	    
	int n=data.length;
//	System.out.println(n);
	for(String s:data)
	{
		if(Integer.parseInt(s)%2==0)
		{
			System.out.println(s);
		}
	}
	
}
}
