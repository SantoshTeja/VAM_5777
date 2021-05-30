package com.vm.training.java.newfeatures;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ProductMethod {
	long productcount(ArrayList<Product> arr)
	{
		return arr.stream().count();
	}


	List productlist(ArrayList<Product> arr)
	{
		return arr.stream().filter(m->m.getCategory().equalsIgnoreCase("ac")).collect(Collectors.toList());
	}
			
			List productByPrice(ArrayList<Product> arr)
			{
				return arr.stream().filter(f->f.getPrice()>=40000).collect(Collectors.toList());
			}
			
			 List productUpperCase(ArrayList<Product> arr)
			 {
				 return arr.stream().map(f->f.getPname().toUpperCase()).collect(Collectors.toList());
			 }
			 
			 List productlowerCase(ArrayList<Product> arr)
			 {
				 return arr.stream().map(f->f.getPname().toLowerCase()).collect(Collectors.toList());
			 }
			 
			 List productQuantity(ArrayList<Product> arr)
			 {
				 return arr.stream().filter(f->f.getCategory().equalsIgnoreCase("ac")).filter(f->f.getQuantity()>2).collect(Collectors.toList());
			 }
			
			
}		
			
			
			
		
	
