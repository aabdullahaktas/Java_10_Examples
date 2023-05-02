package com.bilgeadam.lesson004;

import java.util.Scanner;

/**
 * 
 * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
 * 
 * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
 * alacağız
 * 
 * eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim
 * 
 * eğer mail kodu hatalı ise telefon kodu hatalı çıktısını verelim
 * 
 */
public class Question20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int telefonKod = 10;
		int mailKod = 20;
		System.out.println("Lütfen bir mail kodu giriniz");
		int mKod = scanner.nextInt();
		System.out.println("Lütfen bir telefon kodu giriniz");
		int tKod = scanner.nextInt();

		if (telefonKod == tKod) {
			System.out.println("Telefon kodu dogrudur");
		} else {
			System.out.println("Telefon kodu hatalıdır!!!!!!");
		}

		if (mailKod == mKod) {
			System.out.println("Mail kodu dogrudur");
		} else {
			System.out.println("Mail kodu hatalıdır!!!");
		}

		////////////////////////////////////////
		if (telefonKod != tKod) {
			System.out.println("Telefon kodu hatalıdır!!!!!!");
		}
		if (mailKod != mKod) {
			System.out.println("Telefon kodu hatalıdır!!!!!!");
		}

	}

}
