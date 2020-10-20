package com.day1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] org = new int[] { 1, 5, 9 };

		System.out.println("The original array :");

		for (int i = 0; i < org.length; i++)
			System.out.print(org[i] + " ");

		int[] copy = Arrays.copyOf(org, 3);

		System.out.println("\nThe New Array :");

		for (int i = 0; i < copy.length; i++)
			System.out.print(copy[i] + " ");

	}
}