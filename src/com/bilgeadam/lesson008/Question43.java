package com.bilgeadam.lesson008;

import java.util.Scanner;

/*
 * 
 * 1 metot yazalım menu diye 
 * String işlemleri
 * 1-Harf saydırma--> dısarından string bir ifade ve hangi 
 * harfi saydıracagımız sonucunda bize kaç kere geçtiğini donsun eger o harf ifada de yoksa 
 * aradıgınız harf bulunamadı diye bir cıktı verebilir
 * 
 * 
 * 2-Harf değiştirme
 * 3-Palindrom 
 * 4-Çıkış
 * 
 * 
 * 
 * 
 */

public class Question43 {

	public static void main(String[] args) {

		islem();

	}

	public static void menu() {
		System.out.println("======STRİNG İŞLEMLERİ=======");
		System.out.println("1-Harf saydırma");
		System.out.println("2-Harf değiştirme");
		System.out.println("3-Palindrom");
		System.out.println("4-Çıkış");
		System.out.println("Lütfen bir işlem seçiniz");
	}

	public static void islem() {

		Scanner scanner = new Scanner(System.in);
		int islem;
		do {
			menu();
			islem = scanner.nextInt();
			switch (islem) {
			case 1:
				harfSaydirma();
				break;
			case 2:
				harfDegistir();
				break;
			case 3:
				System.out.println("3.işlem");
				break;
			case 4:
				System.out.println("Çıkış yapılıyor.....!");
				break;
			default:
				break;
			}
		} while (islem != 4);

	}

	public static void harfDegistir() {
		String ifade = stringDegerAl("Lütfen bir ifade giriniz");
		String eskiHarf = stringDegerAl("Lütfen değişmesini istediğiniz harfi giriniz");
		String yeniHarf = stringDegerAl("Lütfen yeni harfi giriniz");
		ifade = ifade.replace(eskiHarf, yeniHarf);
		System.out.println(ifade);
	}

	public static void harfSaydirma() {

		String ifade = stringDegerAl("Lütfen bir değer giriniz");
		String harf = stringDegerAl("Lütfen sayılmasını istediğiniz harfi giriniz");
		char karakter = harf.charAt(0);
		int sayac = 0;
		if (!ifade.contains(harf.substring(0, 1))) {
			System.out.println("Kelime harfi içermiyor ");
			return;
		}
		for (int i = 0; i < ifade.length(); i++) {
			if (ifade.charAt(i) == karakter) {
				sayac++;
			}
		}
		System.out.println(ifade + " de " + sayac + " kadar " + harf.substring(0, 1) + "'i  içeriyor");
	}

	public static String stringDegerAl(String sorgu) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(sorgu);
		String ifade = scanner.nextLine();
		return ifade;
	}

}
