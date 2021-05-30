package com.vm.training.java.CollectionsAssignments;
import java.io.*;
import java.util.*;
public class StudentMarks {

	static int hightestMarks(ArrayList<Integer> arr)
	{
		int max=Collections.max(arr);
		return max;		
	}
	static double averageMarks(ArrayList<Integer> arr)
	{
		int sum=0;
		for(Integer a:arr)
		{
			sum+=a;
		}
		return (sum/arr.size());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int num=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int marks;
		while(num>0)
		{
			arr.add(sc.nextInt());
			num--;
		}
		System.out.println("Highest Marks :"+hightestMarks(arr));
		System.out.println("Average Marks :"+averageMarks(arr));
		System.out.print("Marks :");
		for(Integer a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("3rd student Marks :"+arr.get(2));
		Collections.sort(arr);
		Iterator<Integer> iterator=arr.iterator();
		System.out.println("After Sorting according to marks ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
     	}
		
		
		
		

	}

}
