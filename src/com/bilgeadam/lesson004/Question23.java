package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * 
 * Dışarıdan gişrilen bir sayının asal olup olmadıgını bulalım 
 * 
 * asal ise asaldır çıktısı
 * değil ise asal değildir çıktısı verelim
 * 
 */
public class Question23 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int i;
		for (i = 2; i <= sayi / 2; i++) {

			if (sayi % i == 0) {
				break;
			}
		}

		if (i > sayi / 2) {
			System.out.println("Asal sayıdır");
		} else {
			System.out.println("Asal sayı değildir");
		}

	}
}
