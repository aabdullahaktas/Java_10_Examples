package com.bilgeadam.lesson011;

/*
 * bir dizide 13 var ise 13 ve bir sonra ki elaman toplama eklenmeden topma sonucu bulan kod
 * 
 * 
 * 
 */

public class Question55 {

	public static void main(String[] args) {
		int[] sayilar = { 13, 13, 13, 13, 5, 1 };

		toplamBul2(sayilar);

	}

	public static void toplamBul(int[] sayilar) {

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 13) {
				if (i + 1 < sayilar.length && sayilar[i + 1] != 13) {
					i++;
				}

			} else {
				toplam += sayilar[i];
			}

		}

		System.out.println(toplam);
	}

	public static void toplamBul2(int[] sayilar) {

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 13 || (i > 1 && sayilar[i - 1] == 13)) {
				continue;
			} else {
				toplam += sayilar[i];
			}

		}

		System.out.println(toplam);
	}
}
