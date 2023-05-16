package com.bilgeadam.lesson011;

import java.util.Scanner;

public class Question54 {

	static Scanner scanner = new Scanner(System.in);

	public static void menu() {

		int kontrol = 0;

		do {
			System.out.println("==Hesap makinesi===\n");
			System.out.println("1- Topla");
			System.out.println("2- Çıkar");
			System.out.println("3- Çarp");
			System.out.println("4- Böl");
			System.out.println("0- Çıkış");
			System.out.println("Bir işlem Seçiniz");
			kontrol = Integer.parseInt(scanner.nextLine());

			switch (kontrol) {
			case 1:
				System.out.println("toplam===>" + topla2());
				break;
			case 2:
				System.out.println("sonuc===>" + cikar());
				break;
			case 3:
				System.out.println("sonuc===>" + carpma());
				break;

			case 4:
				System.out.println("sonuc===>" + bolme());
				break;
			case 0:
				System.out.println("Program sonlanıyor......");
				break;
			default:
				System.out.println("Yanlış bir seçim yaptınız lütfen tekrar deneyiniz");
				break;
			}

		} while (kontrol != 0);

	}

	public static int cikar() {

		String sayi = "";
		int sonuc = 0;
		int sayac = 0;

		System.out.println("Lütfen bir sayı giriniz");

		while (!(sayi = scanner.nextLine()).equals("=")) {
			sayac++;
			if (sayac == 1) {
				sonuc = Integer.parseInt(sayi);
			} else {
				sonuc -= Integer.parseInt(sayi);
			}
			System.out.println("Lütfen bir sayı giriniz");
		}

		return sonuc;
	}

	public static int topla() {

		String sayi = "";
		int toplam = 0;

		do {
			System.out.println("Lütfen bir sayı giriniz");
			sayi = scanner.nextLine();
			if (!sayi.equals("=")) {
				toplam += Integer.parseInt(sayi);
			}

		} while (!sayi.equals("="));

		return toplam;
	}

	public static int topla2() {
		String sayi = "";
		int toplam = 0;
		System.out.println("Lütfen bir sayı giriniz");
		while (!(sayi = scanner.nextLine()).equals("=")) {
			toplam += Integer.parseInt(sayi);
			System.out.println("Lütfen bir sayı giriniz");
		}

		return toplam;
	}

	public static int carpma() {
		String sayi = "";
		int carpim = 1;
		System.out.println("Lütfen bir sayı giriniz");
		while (!(sayi = scanner.nextLine()).equals("=")) {

			carpim *= Integer.parseInt(sayi);
			System.out.println("Lütfen bir sayı giriniz");

		}
		return carpim;
	}

	public static double bolme() {
		String sayi = "";
		double sonuc = 1;
		int sayac = 0;
		System.out.println("Lütfen bir sayı giriniz");
		while (!(sayi = scanner.nextLine()).equals("=")) {
			sayac++;
			if (sayac == 1) {
				sonuc = Double.parseDouble(sayi);
			} else {

				sonuc /= Double.parseDouble(sayi);
			}
			System.out.println("Lütfen bir sayı giriniz");
		}
		return sonuc;
	}

	public static void main(String[] args) {
		menu();
		// double sonuc = 5.2 / 0;
		// System.out.println(sonuc);

		// Question54 myObject = new Question54();

	}
}
