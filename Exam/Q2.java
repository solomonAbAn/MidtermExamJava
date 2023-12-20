package Exam;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question 2 : 
//		Write a Java program to search for a specific element in a 2D array. The program should
//		take a 2D array and a target element as input and output the row and column indices of
//		the target element if it is found. If the element is not present, output a message
//		indicating its absence.
//		Input Array:
//		1 2 3
//		4 5 6
//		7 8 9
//		Target Element: 5
//		Output:
//		The target element 5 is found at row 2, column 2.

		// search
		// specific element
		// 2D array

		// CREATING THE ARRAY
		int[][] array = new int[3][3];
		Scanner kb = new Scanner(System.in);
		int i;
		int j;
		for (i=0;i<array.length;i++) {
			for(j=0; j<array.length;j++) {
				System.out.println("give me the index of array [" + i + "]" + "[" + j + "]");
				array[i][j] = kb.nextInt();
			}
			
		}
		//Showing The array
		System.out.println("Input array:");
		for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
	  }
		
		//the target
		System.out.print("Target Element: ");
		int target = kb.nextInt();
		
		//the search
		System.out.println("Output: ");
		for (i=0;i<array.length;i++) {
			for(j=0; j<array.length;j++) {
				if(array[i][j]==target) {
				System.out.println("The target element " + target + " is found at row " + ++i + ", column " + ++j +".");
				System.exit(0);
			}
			}
		}
		System.out.println("The target element " + target + " is NOT found.");
		
		
		
		
		
		kb.close();
		
	}

}
