package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Dışarıdan girilen bir sayının faktoriyelini hesaplayalım
 * 
 * 
 * 
 */
public class Question13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int faktoriyel = 1;
		int sayi = scanner.nextInt();
		int i = 1;
		while (sayi >= i) {

			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("faktoriyel= " + faktoriyel);

		System.out.println("Lütfen bir sayi giriniz");
		sayi = scanner.nextInt();
		faktoriyel = 1;

		for (int j = 1; j <= sayi; j++) {

			faktoriyel *= j;
		}

		System.out.println("faktoriyel= " + faktoriyel);

		faktoriyel = 1;

		for (int j = sayi; j >= 1; j--) {

			faktoriyel *= j;
		}

		System.out.println("faktoriyel= " + faktoriyel);

	}

}
