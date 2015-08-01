package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Lets add two numbers.");
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		int firstNumber = in.nextInt();
		
		System.out.print("Enter your second number: ");
		int secondNumber = in.nextInt();
		
		int result = firstNumber + secondNumber;
		System.out.println("The result is: " + result);
		
		in.close();
	}

}
