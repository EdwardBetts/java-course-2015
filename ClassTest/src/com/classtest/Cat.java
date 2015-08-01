package com.classtest;

public class Cat extends Mammal {
	protected final String name;
	
	public Cat(String catName) {
		name = catName;
	}
	
	@Override
	public String speak() {
		return "Meow, " + name;
	}
}
