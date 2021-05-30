package com.vm.training.java.collections;
import java.util.*;
public class ArrayListProgram {
       static boolean Searchelement(int num,ArrayList ar)
	{
		//Iterator<Integer> it=ar.iterator();
		return ar.contains(num);
		
	}
       static ArrayList Sorted(ArrayList arrr)
       {
    	   Collections.sort(arrr);
    	   return arrr;
       }
       static ArrayList SortedReverse(ArrayList arrr)
       {
    	   Collections.reverse(arrr);
    	   return arrr;
       }
       static int Maximum(ArrayList arr)
       {
		return (int) arr.get(0);
    	   
       }
       static int Minimum(ArrayList arr,int n)
       {
    	   return (int)arr.get(n-1);
       }
     static int Evensum(ArrayList<Integer> arr)
       {
    	   Iterator<Integer> itr=arr.iterator();
    	   int sum=0;
    	   while(itr.hasNext())
    	   {
    		   if(itr.next()%2==0)
    		   {
    			   sum=sum+itr.next();
    		   }
    	   }
    	   return sum;
       }
       


	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		arr.add(14);
		arr.add(5);
		arr.add(7);
		arr.add(8);
		
		boolean st=Searchelement(4,arr);
		System.out.println(st);
		//Scanner sc=new Scanner(System.in);
		System.out.println("After Sorting in increasing order :"+Sorted(arr));
		System.out.println("After sorting in decreasing order :"+SortedReverse(arr));
		int n=arr.size();
		System.out.println("maximum element is "+Maximum(arr));
		System.out.println("minimum element is "+Minimum(arr,n));
		System.out.println("Even sum is : "+Evensum(arr));
		
		
	}

}
