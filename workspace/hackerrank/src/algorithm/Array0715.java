package algorithm;

import java.util.Scanner;

public class Array0715 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int arr2 = 0;
		for (int j = n-1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
	}

}
