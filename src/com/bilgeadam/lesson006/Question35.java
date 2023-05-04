package com.bilgeadam.lesson006;

/*
 * deger stringinin karakterleri toplamı kaçtır;
 * 
 * 
 */
public class Question35 {

	public static void main(String[] args) {

		String deger = "1243513";

		int toplam = 0;
		int sayi1 = Integer.parseInt(deger);
		int basamak = 0;

		while (sayi1 >= 1) {
			basamak = sayi1 % 10;
			toplam += basamak;
			sayi1 /= 10;
		}
		System.out.println(toplam);
	}
}
