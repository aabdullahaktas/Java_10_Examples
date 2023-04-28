package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * 
 * Girilen sayının basamakları toplamını ekrana yazdıralım ve
 * kaç basamaklı oldugunuda yazdıralım 
 * 
 * 
 * 
 */
public class Question15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int basamakDegeri;
		int sayi = scanner.nextInt();
		int sayac = 0;
		int toplam = 0;
		do {
			basamakDegeri = sayi % 10; // 0-0-1
			toplam += basamakDegeri;// 0-0-1
			sayi /= 10;// 10-1-0.1=0
			sayac++;// 1-2-3

		} while (sayi != 0); // sayi>0 veya sayi>=1

		System.out.println("toplam= " + toplam);
		System.out.println("basamak sayısı= " + sayac);

		/// while ile çözümü
		sayi = scanner.nextInt();
		sayac = 0;
		toplam = 0;

		while (sayi > 0) {
			basamakDegeri = sayi % 10;
			toplam += basamakDegeri;
			sayi /= 10;
			sayac++;
		}

		System.out.println("toplam= " + toplam);
		System.out.println("basamak sayısı= " + sayac);

		/// for ile çözüm
		sayac = 0;
		toplam = 0;

		for (int sayi2 = scanner.nextInt(); sayi2 > 0; sayi2 /= 10) {
			basamakDegeri = sayi2 % 10;
			toplam += basamakDegeri;

			System.out.println(sayac);
			sayac++;
		}

		// bu şekildede çalışır
//		for (int sayi2 = scanner.nextInt(); sayi2 > 0; ) {
//			basamakDegeri = sayi2 % 10;
//			toplam += basamakDegeri;
//          sayi2 /= 10
//			System.out.println(sayac);
//			sayac++;
//		}

		System.out.println("toplam= " + toplam);
		System.out.println("basamak sayısı= " + sayac);
	}

}
