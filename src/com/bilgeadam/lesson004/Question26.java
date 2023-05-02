package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * iki tane sayı değişkenimiz olsun 
 * 
 * dışarıdan bir işlem sececeğiz (toplama bölme çıkarma çarpma (+,/,-,*)  )
 * dışarıdan sectiğmiz işleme gore bize o işlemi yapıp sonucu bulsun ;
 * ve en sonudada sonucu yazdıralım  
 * 
 */
public class Question26 {

	public static void main(String[] args) {

		int sayi1 = 58;
		int sayi2 = 94;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir işlem seciniz (+,/,-,*)");
		String islem = scanner.nextLine();
		double sonuc;
		switch (islem) {
		case "+":
			sonuc = sayi1 + sayi2;
			System.out.println("toplama işleminin sonucu " + sonuc);
			break;
		case "-":
			sonuc = sayi1 - sayi2;
			System.out.println("çıkarma işleminin sonucu " + sonuc);
			break;
		case "/":
			sonuc = (double) sayi1 / sayi2;
			System.out.println("bolme işleminin sonucu " + sonuc);
			break;
		case "*":
			sonuc = sayi1 * sayi2;
			System.out.println("Çarpma işleminin sonucu " + sonuc);
			break;
		default:
			break;
		}

	}

}
