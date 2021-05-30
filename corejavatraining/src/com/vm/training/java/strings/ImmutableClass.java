package com.vm.training.java.strings;

public class ImmutableClass {
	private int num=100;
	private String str="Name";
	public ImmutableClass(int num, String str) {
		super();
		this.num = num;
		this.str = str;
	}
	public int getNum() {
		return num;
	}
	
	public String getStr() {
		return str;
	}
	

}
