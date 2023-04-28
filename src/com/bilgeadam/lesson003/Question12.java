package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Kullanıcıdan alınan bir sayının carpım tablosunu yazdıralım 
 * 
 * 10 a kadar 
 * 1x1=1
 * 1x2=2
 * 1x3=3
 * 
 * 
 * 
 */
public class Question12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi = input.nextInt();
		System.out.println("Çarpım tablosu ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(sayi + "x" + i + "= " + (sayi * i));
		}

	}

}
