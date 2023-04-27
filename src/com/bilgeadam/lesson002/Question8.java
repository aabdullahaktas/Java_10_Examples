package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * Dışarıdan vize ve final bilgisi girilsin
 * daha sonra ogrenci ismi girilsin 
 * 
 * çıktı olarak eğer ortalama 60 ın uzerinde ise Mustafa adlı ogrenci geçti çıktısını verelim 
 * altında ise Mustafa adlı ogrenci kaldı çıktısını verelim 
 * 
 * ort=vizenin yuzde 40 finalin yuzde 60 alınsın 
 * 
 * 
 * 
 */
public class Question8 {

	public static void main(String[] args) {
		
		double vize,finalNotu,ortalama;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen vize notunu Griniz");
		vize=scanner.nextDouble();
		System.out.println("Lütfen final notunu Griniz");
		finalNotu=scanner.nextDouble();	
		ortalama=(vize*0.4)+(finalNotu*0.6);
		System.out.println("Lütfen ogrenci ismini giriniz");
		scanner.nextLine();
		String isim=scanner.nextLine();
		
	
		
		System.out.print( isim+ " adlı Ogrenci ");
		System.out.print(ortalama>60?"Gecti":"Kaldı");
		
		System.out.println();
		String durum=ortalama>60?"Gecti":"Kaldı";
		
		System.out.println(isim+" adlı örenci "+ durum +" ort: " +ortalama);
		
		
		

	}

}
