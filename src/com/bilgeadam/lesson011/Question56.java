package com.bilgeadam.lesson011;

import java.util.Arrays;

public class Question56 {

	public static void main(String[] args) {

		int[] dizi = { 36, 5, 4, 7, 87, 96, 125 };

		Arrays.sort(dizi);

		for (int i : dizi) {
			System.out.println(i);
		}

		int[] dizi2 = new int[5];
		Arrays.fill(dizi2, 10);
		Arrays.fill(dizi, 15);

		for (int i : dizi2) {
			System.out.println(i);
		}

		for (int i : dizi) {
			System.out.println(i);
		}

		int[][] dizi3 = new int[5][5];

		// Arrays.fill(dizi3, 55);

		for (int[] is : dizi3) {

			Arrays.fill(is, 55);

		}

		for (int[] is : dizi3) {

			for (int is2 : is) {
				System.out.println(is2);
			}

		}

		int[] dizi4 = { 36, 5, 4, 7, 87, 96, 125 };
		int[] dizi5 = { 36, 5, 4, 7, 87, 96, 125 };

		System.out.println(Arrays.equals(dizi4, dizi5));

		System.out.println(Arrays.toString(dizi5));

		int[] dizi6 = dizi5.clone();

		System.out.println(dizi5 == dizi6);
		Arrays.sort(dizi5);
		int deger = Arrays.binarySearch(dizi5, 5);

		System.out.println(deger);

	}

}
