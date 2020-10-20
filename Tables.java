package com.day1;

public class Tables {

	public static void main(String[] args) {

		int i, j;
		System.out.println("*| " + "1\t2\t3\t4\t5\t6\t7\t8\t9\t");
		System.out.println("-----------------------------------------------------------------");
		for (i = 1; i <= 9; i++) {
			System.out.print(i + "| ");
			for (j = 1; j <= 9; j++) {
				System.out.print(i * j);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}

}
