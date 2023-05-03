package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
 * 
 * dışarıdan girilen 0 ile 100 arası 100 de dahil 
 * 5 adet sayıdan en buyuk ve en kucuk olanı bulup ekrana yazdıran 
 * programın kodu;
 * 
 * 
 */
public class Question30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		int max = Integer.MIN_VALUE;// -1
		int min = Integer.MAX_VALUE;// 101

		for (int i = 0; i < 5; i++) {
			System.out.println("Lütfen" + (i + 1) + ".bir sayi giriniz");
			sayi = scanner.nextInt();
			if (sayi <= 100 && sayi >= 0) {

				if (sayi > max) {
					max = sayi;// 12-24-""-""-36
				}
				if (sayi < min) {
					min = sayi;// 12-""-10-5-""
				}

			} else {
				i--;
				System.out.println("Lütfen belirtilen aralıklarda bir sayi giriniz ");
			}

		}
		System.out.println("max= " + max);
		System.out.println("min= " + min);
		System.out.println("While dongusu");
		int sayac = 0;
		while (sayac < 5) {
			System.out.println("Lütfen" + (sayac + 1) + ".bir sayi giriniz");
			sayi = scanner.nextInt();
			if (sayi <= 100 && sayi >= 0) {

				if (sayi > max) {
					max = sayi;// 12-24-""-""-36
				}
				if (sayi < min) {
					min = sayi;// 12-""-10-5-""
				}
				sayac++;

			} else {
				System.out.println("Lütfen belirtilen aralıklarda bir sayi giriniz ");
			}

		}
		System.out.println("max= " + max);
		System.out.println("min= " + min);
	}

}
