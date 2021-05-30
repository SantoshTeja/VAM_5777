package com.vm.training.java.newfeatures;


interface Calculate
{
	void addition(int a,int b);
}
interface Calculate1
{
	int multiply(int a,int b);
}
interface Large
{
	int largenumber(int a,int b);
}
interface LengthCount
{
	int count(String str);
}
interface StringReverse
{
	String strreverse(String str);
}
interface ArraySum
{
	int arraysum(int arr[]);
}
interface SmallestElementArray
{
	int smallElement(int arr[]);
}
public class LamdaExpressionsWithParameters {
public static void main(String[] args) {
	Calculate cal= (a,b)->System.out.println("After addition : "+(a+b));
	cal.addition(2, 4);
	System.out.println("=============================");
	
	Calculate1 cal1=(a,b)->(a*b);
	System.out.println("After Multiplication "+cal1.multiply(2, 4));
	System.out.println("=============================");
	
	Large large=(a,b)->
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	};
	
	System.out.println("Largest number is :"+large.largenumber(4, 6));
	System.out.println("=============================");
	
	LengthCount len= (str)->
	{
		int n;
		n=str.length();
		return n;
		
	};
	
	System.out.println("The length of the string is :"+len.count("Santosh Teja"));
	System.out.println("=============================");
	StringReverse st=(str)->
	{
		StringBuilder sb=new StringBuilder(str);

		String s=sb.reverse().toString();
		return s;
		
	};
	System.out.println("The reverse String is: "+st.strreverse("Santosh"));
	System.out.println("=============================");

	ArraySum arr=(arrr) ->
	{
		int sum=0;
		for(int i=0;i<arrr.length;i++)
		{
			sum=sum+arrr[i];
		}
		return sum;
		
	};
	int ar[]= {1,2,3,4,5,6};
	System.out.println("The sum of the array elements is :"+arr.arraysum(ar));
	System.out.println("=============================");

	SmallestElementArray array=(arrr) ->
	{
		int small=arrr[0];
		
		for(int i=1;i<arrr.length;i++)
		{
			if(arrr[i]<small)
			{
				small=arrr[i];
			}
		}
		return small;
	};

	System.out.println("The smallest element in the array is :"+array.smallElement(ar));
}

}
