package com.vm.training.java.collections;

public class Wrestler {
	private String name;
	private Double height;
	private int weight;
	public Wrestler(String name, Double height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Wrestler [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
