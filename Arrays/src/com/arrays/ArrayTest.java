package com.arrays;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numberList = new int[5];
		System.out.println(Arrays.toString(numberList));
		numberList[1] = 1;
		System.out.println(Arrays.toString(numberList));
		System.out.println("***************");

		int[] numberList2 = { 0, 1, 2, 3, 4 };
		System.out.println(Arrays.toString(numberList2));
		for (int i = 0; i < numberList2.length; i++) {
			numberList2[i] *= 2;
		}
		System.out.println(Arrays.toString(numberList2));

		System.out.println("***************");
		int[] numberList3 = { 4, 3, 2, 1, 0 };
		System.out.println(Arrays.toString(numberList3));
		for (int i = numberList3.length - 1; i >= 0; i--) {
			numberList3[i] *= 2;
		}
		System.out.println(Arrays.toString(numberList3));
	}
}
