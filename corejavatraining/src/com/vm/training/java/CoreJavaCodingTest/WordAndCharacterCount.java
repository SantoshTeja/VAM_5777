package com.vm.training.java.CoreJavaCodingTest;
import java.util.*;
public class WordAndCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		int len=str.length();
		int wordcount=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==' ')
			{
				wordcount++;
			}
		}
		System.out.println("No of charcters present in the String are :"+(len-wordcount));
		System.out.println("No of words present in the String are :"+(wordcount+1));
	}

}
