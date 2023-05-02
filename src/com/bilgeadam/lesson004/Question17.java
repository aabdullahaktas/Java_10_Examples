package com.bilgeadam.lesson004;

/*
 * 
 * Soru2-)  a dan z ye kadar alafabeyi yazdıralım ;( dongu kullanarak)
 * 
 */
public class Question17 {

	public static void main(String[] args) {

		char c;
		for (c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println();

		char karakter = 97;

		while (karakter >= 97 && karakter <= 122) {
			System.out.print(karakter + " ");
			karakter++;
		}

		System.out.println();
		for (char i = 97; i <= 122; i++) {

			System.out.print(i + " ");
		}
	}
}
