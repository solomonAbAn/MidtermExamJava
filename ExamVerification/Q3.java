package ExamVerification;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Question 3 : 8 Marks
//		Write a Java program that takes an array of integers as input and finds and prints the
//		duplicate elements. If there are no duplicates, output a message indicating so.

		// array
		// input
		// find duplicate
		// if no duplicate print indication

		// creating
		int[] array = new int[10];
		Scanner kb = new Scanner(System.in);
		int i;
		System.out.println("give me the 10 indexes of an array");
		for (i = 0; i < array.length; i++) {

			array[i] = kb.nextInt();

		}
		kb.close();

		// printing
		System.out.println("Input array:");
		for (int n : array) {

			System.out.print(n + " ");

		}
		System.out.println();
		findDuplicates(array);

	}

	public static void findDuplicates(int[] array) {

		int duplicates = 0;
		int exist = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					duplicates++;
					exist++;
				}
			}
			if (duplicates != 0) {
				System.out.println(array[i] + " has " + duplicates + " duplicates");
				duplicates = 0;

			}

		}

		if (exist == 0) {
			System.out.println("There are NO duplicates");
		}

	}

}
