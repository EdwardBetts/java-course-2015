package com.classtest;

public class Lion extends Cat {

	public Lion(String catName) {
		super(catName);
	}
	
	@Override
	public String speak() {
		return "Roar, " + name;
	}

}
