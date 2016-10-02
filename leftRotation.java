import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class leftRotation {

	/**
	 * function to rotate elements
	 * 
	 * @param arr
	 *            : array to be rotated
	 * @param rotations
	 *            : no of rotations
	 * @return rotated array
	 */
	public static int[] arrayRotate(int[] arr, int k) {
		int n = arr.length;
		int[] rotated = new int[n]; // storage for rotated array

		// arraycopy(source,position of element to be moved in
		// source,destination,position of element to be moved in destination, no
		// of elements to be moved)
		System.arraycopy(arr, k, rotated, 0, n - k);
		System.arraycopy(arr, 0, rotated, n - k, k);

		// return rotated array
		return rotated;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rotations = sc.nextInt();
		int unrotated[] = new int[n];
		for (int i = 0; i < n; i++) {
			unrotated[i] = sc.nextInt();
		}

		sc.close();
		unrotated = arrayRotate(unrotated, rotations);

		// printing rotated element
		for (int j = 0; j < n; j++) {
			System.out.print(unrotated[j] + " ");
		}
	}
}
