
/**
Input Format

There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array ;
 every value in  will be in the inclusive range of -9 to 9.

Output Format

Print the largest (maximum) hourglass sum found in matrix.
 */

import java.util.*;

public class twoDArray {
	int noOfElements = 7;
	int minValue = -9;

	// set max sum to lowest value into number of elements.
	int maxSum = noOfElements * minValue;
	// int rows=6;
	// int cols=6;

	static int[][] a;
	int sum;

	/**
	 * parameterized costructor.
	 * 
	 * @param r
	 * @param c
	 */
	twoDArray(int r, int c) {
		a = new int[r][c];
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns:");
		int cols = sc.nextInt();

		twoDArray s = new twoDArray(rows, cols);

		System.out.println("Enter elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();

			}
		}
		System.out.println("Matrix recieved!!");

		s.printMatrix();
		s.computeSum();
	}

	/**
	 * Prints matrix
	 */
	public void printMatrix() {
		System.out.println("Printing Matrix!!");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "");
			}
			System.out.println();
		}
	}

	/**
	 * Computes maximum sum.
	 */
	public void computeSum() {
		/**
		 * Hour glass is possible starting from positions(1,1) to
		 * (rows-2,cols-2)
		 */
		for (int i = 1; i <= a.length - 2; i++) {
			for (int j = 1; j <= a[0].length - 2; j++) {
				sum = a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j] + a[i + 1][j - 1] + a[i + 1][j]
						+ a[i + 1][j + 1];

				// check if sum is greater than max sum.
				if (sum > maxSum)
					maxSum = sum;
			}
		}
		System.out.println("Highest hour glass sum is:" + maxSum);
	}

}
