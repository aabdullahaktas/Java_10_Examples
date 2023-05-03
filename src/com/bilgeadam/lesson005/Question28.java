package com.bilgeadam.lesson005;

import java.util.Scanner;

//2- Girilen sayının 5 in kuvveti olup olmadığını bulan kod
public class Question28 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = scanner.nextInt();
		int sayac = 0;
		while (true) {
			if (sayi % 5 == 0) {
				sayi = sayi / 5;
				sayac++;
			} else if (sayi == 1) {
				System.out.println("sayi 5 in kuvvetidir");
				break;
			} else {
				System.out.println("5 in kuvveti değildir");
				break;
			}

		}
		System.out.println(sayac);

	}
}
