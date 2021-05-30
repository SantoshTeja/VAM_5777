package com.vm.training.java.newfeatures;

import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class StreamEmployee {
public static void main(String[] args) {
	ArrayList<Employee> employee=new ArrayList<Employee>();
	employee.add(new Employee(101,"santosh","cse",23,25000));
	employee.add(new Employee(102,"mary","cse",43,20000));
	employee.add(new Employee(103,"mani","ece",24,40000));
	employee.add(new Employee(104,"teja","cse",45,75000));
	employee.add(new Employee(105,"john","cse",27,95000));
	employee.forEach(s->System.out.println(s));


	long empcount=employee.stream().count();
	System.out.println("The total number of employees are :"+empcount);
	System.out.println("=============Employees from cse department=============");
	employee.stream().filter(s->s.getDept().equals("cse")).forEach(s->System.out.println(s));
	//employee.stream().filter(s->s.getName().startsWith("m").forEach(s->System.out.println(s));
	System.out.println("=========Employee name starts with m==============");
	employee.stream().filter(s1->s1.getName().startsWith("m")).forEach(s->System.out.println(s));
	long empcountofsalary=employee.stream().filter(s2->s2.getSalary()>50000).count();
	System.out.println("=========Employees with salary greater than 50000=======");
	System.out.println(empcountofsalary);
	employee.stream().map(m->m.getSalary()*0.20+m.getSalary()+"  "+m.getName()+" "+m.getName().length()).forEach(System.out::println);

	employee.stream().sorted((e1,e2)->
	{
	if(e1.getSalary()==e2.getSalary())
	{
		return 0;
	}
	else if(e1.getSalary()>e2.getSalary())
	{
		return 1;
	}
	else
	{
		return -1;
	}
	}
	).forEach(System.out::println);
	System.out.println("=========After sorting by name============");

	List<Employee> list=employee.stream().sorted((e1,e2)->
	{
		return e1.getName().compareTo(e2.getName());
	}).collect(Collectors.toList());
	list.forEach(System.out::println);
	System.out.println("=============Sort by salary==============");

	employee.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

	System.out.println("======After sorting by name========");
	

	employee.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

	long sum=employee.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();

	System.out.println("the total salary is:"+sum);
	System.out.println("===========Total salary of all cse dept============");
	
	long su=employee.stream().filter(s->s.getDept().equals("hr")).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
	System.out.println(su);
	System.out.println("============distinct elements===========");
	List<Employee> listemp=employee.stream().distinct().collect(Collectors.toList());
	listemp.forEach(System.out::println);
	System.out.println("==========After Skipping values=========");
	employee.stream().skip(3).forEach(System.out::println);
	
	//employee.stream().reduce(a,b)->a+b)
}


}
