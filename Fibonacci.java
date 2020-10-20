package com.day1;

public class Fibonacci {

	public static void main(String[] args) {

		int i, n = 20, t1 = 1, t2 = 1, t3;
		System.out.println("The first " + n + " fibonacci numbers are:");
		System.out.print(t1 + " " + t2);
		for (i = 3; i <= n; i++) {
			t3 = t1 + t2;
			System.out.print(" " + t3);
			t1 = t2;
			t2 = t3;
		}

	}

}
