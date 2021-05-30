package com.vm.training.java.strings;

public class ObjectCreation {
	public static void main(String[] args) {
		ImmutableClass im=new ImmutableClass(67,"Santtosh");
		System.out.println(im.getNum());
		System.out.println(im.getStr());
	}

}
