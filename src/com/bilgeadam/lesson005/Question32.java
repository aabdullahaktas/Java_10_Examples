package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
 * Dışarıdan bir kelime girelim 
 * bu kelime içerisinde kucuk a kac defa geçiyor bize soylesin 
 * 
 * 
 */
public class Question32 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scanner.nextLine();
		int sayac = 0;

		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == 'a') {
				sayac++;
			}
		}
		System.out.println(sayac + " tane a harfi vardır");

	}

}
