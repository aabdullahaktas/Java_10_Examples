package com.bilgeadam.lesson002;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * @author musty
 * 
 * Dışarıdan veri alma ile ilgili ornekler
 * 
 * Scanner
 *
 */
public class Question5 {
	
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);

		System.out.println("Lütfen bir isim giriniz");
		String isim=input.nextLine();
		System.out.println("isim= "+isim);
		//toplu yorum satırı kısayolu ctrl shift c
		int sayi1=10;
		System.out.println("Lütfen bir sayi giriniz");
		int sayi2=input.nextInt();
		System.out.println("Lütfen bir sayi daha giriniz");
		double sayi3=input.nextDouble();// consoledan ondalık değerleri , ile girelim 25,4
//		long sayi4=input.nextLong();
//		float sayi5=input.nextFloat();
		
		System.out.println("sonuc="+(sayi1+sayi2+sayi3));
		
		// int( sayısal) degerden sonra bir String deger almak istersek mutlaka 
		// bos bir nextLine() kullanalım
		input.nextLine();
		System.out.println("Lütfen bir isim giriniz");
		String isim2=input.nextLine();
		System.out.println("isim2:"+isim2 );
		
		System.out.println("Lütfen yeni bir isim giriniz");
		 isim2=input.nextLine();
		System.out.println("isim2:"+isim2 );
		
	}

}
