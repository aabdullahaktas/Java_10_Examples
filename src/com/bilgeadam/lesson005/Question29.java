package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
 * Mukemmel sayi dışarıdan girilen bir sayının mukemmel sayı 
 * olup olmadıgını bulup mukemmel sayı ise mukemmel sayıdır cıktısı
 * değil ise mukemmel sayı değildir cıktısı versin
 * 
 * 6=1+2+3; Kendisi haric tam bolenlerinin toplamı kendisine eşit olan sayı
 * 
 * 
 */
public class Question29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();

		for (int i = 1; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}

		if (sayi == toplam) {
			System.out.println(sayi + " Mükemmel bir sayıdır.");
		} else {
			System.out.println(sayi + " Mükemmel bir sayıdır değildir!!!");
		}

	}

}
