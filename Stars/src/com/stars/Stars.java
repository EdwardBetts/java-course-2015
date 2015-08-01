package com.stars;

public class Stars {

	public static void main(String[] args) {
		String stars = "*";
		for (int i = 0; i < 17; i++) {
			System.out.println(stars);
			stars += "*";
		}
	}

}
