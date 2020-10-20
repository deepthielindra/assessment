package com.day1;

import java.util.Scanner;

public class GradeAverage {

	private final int LOWEST_GRADE = 0;
	private final int HIGHEST_GRADE = 100;

	private int[] grades;

	private Scanner in;

	public static void main(String[] args) {
		GradeAverage aGradeAverage = new GradeAverage();
		aGradeAverage.in = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numStudents = aGradeAverage.in.nextInt();

		aGradeAverage.run(numStudents);
	}

	private void run(int numStudents) {
		if (numStudents <= 0) {
			System.out.println("Invalid number of students.");
			return;
		}
		grades = new int[numStudents];

		double sum = 0;
		int i = 0;
		while (i < numStudents) {
			System.out.printf("Enter the grade for student %d: ", (i + 1));
			int grade = in.nextInt();

			if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
				grades[i] = grade;
				sum += grade;
				i++;
				continue;
			}
			System.out.println("Invalid grade, try again...");
		}
		System.out.printf("The average is : %f\n", (sum / numStudents));
	}

}

