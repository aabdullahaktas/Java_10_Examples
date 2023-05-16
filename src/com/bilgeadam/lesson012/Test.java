package com.bilgeadam.lesson012;

import java.util.Random;

/*
 * Random kullanımı 
 * 
 */
public class Test {

	public static void main(String[] args) {
		Random random = new Random();
		int sayi = random.nextInt(3);
		System.out.println(sayi);
		int sayi2 = random.nextInt(5, 9);
		System.out.println(sayi2);
		double sayi3 = random.nextDouble(10);
		System.out.println(sayi3);
		boolean kontrol = random.nextBoolean();
		System.out.println(kontrol);

	}

}
