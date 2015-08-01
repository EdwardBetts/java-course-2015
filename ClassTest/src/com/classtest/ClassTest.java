package com.classtest;

public class ClassTest {

	public static void main(String[] args) {
		System.out.println("This is a class test.");
		
		Mammal mammal = new Mammal();
		System.out.println(mammal);
		System.out.println(mammal.speak());
		System.out.println("****************");
		
		Cat cat = new Cat("Garfield");
		System.out.println(cat);
		System.out.println(cat.speak());
		System.out.println("****************");
		
		Lion lion = new Lion("Simba");
		System.out.println(lion);
		System.out.println(lion.speak());
		System.out.println("****************");

	}

}
