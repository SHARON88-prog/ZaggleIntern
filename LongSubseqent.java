package com.longSubsequent;

import java.util.Scanner;

public class LongSubseqent {
	public static void main(String[] args) {

		int c = 0;
		int ma = 0, mi = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int l = sc.nextInt();
		int arr[] = new int[l + 1];
		for (int i = 0; i < l; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		for (int i = 0; i < l - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				c = c + 1;
			}

			else {

				if (c > ma) {
					ma = c;
					mi = i;
				}
				c = 0;
			}
		}
		int n = mi - ma;
		for (int i = n; i <= mi; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}