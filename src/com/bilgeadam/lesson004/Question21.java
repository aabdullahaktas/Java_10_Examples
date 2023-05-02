package com.bilgeadam.lesson004;

import java.util.Scanner;

/**
 * 
 * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
 * 
 * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
 * alacağız
 * 
 * ikiside dogru ise sisteme kayıt oldunuz telefon dogru email yanlış ise =>
 * email kodu hatalıdır email dogru telefon yanlış ise => telefon kdou hatalıdır
 * ikiside yanlış ise => telefon ve email kodu hatalıdır
 * 
 */
public class Question21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int telefonKod = 10;
		int mailKod = 20;
		System.out.println("Lütfen bir mail kodu giriniz");
		int mKod = scanner.nextInt();
		System.out.println("Lütfen bir telefon kodu giriniz");
		int tKod = scanner.nextInt();

		if (telefonKod == tKod && mailKod == mKod) {
			System.out.println("Sisteme kayıt başarılı");
		} else if (telefonKod == tKod && mailKod != mKod) {
			System.out.println("email kodu hatalıdır");
		} else if (telefonKod != tKod && mailKod == mKod) {
			System.out.println("telofon kodu hatalıdır");
		} else {
			System.out.println("Telefon ve mail kodu hatalıdır");
		}

	}

}
