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
public class Question24 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		boolean asalmi = true;

		if (sayi < 2) {
			asalmi = false;
		} else {

			for (int i = 2; i < sayi / 2; i++) {
				if (sayi % i == 0) {
					asalmi = false;
					break;
				}

			}

		}

		if (asalmi) {
			System.out.println(sayi + " Asal sayıdır");
		} else {
			System.out.println(sayi + " Asal Sayı değildir");
		}

	}
}
