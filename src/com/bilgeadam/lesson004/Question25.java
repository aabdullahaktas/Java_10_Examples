package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String boyut2 = scanner.nextLine();
		String boyut = "XLL"; // S-M-L-XL Pizza boyutlarımız

		switch (boyut2) {
		case "S":
			System.out.println("Küçük boy Pizza sectiniz");
			break;
		case "M":
			System.out.println("Orta boy Pizza sectiniz");
			break;
		case "L":
			System.out.println("Buyuk boy Pizza sectiniz");
			break;
		case "XL":
			System.out.println("Extra Buyuk boy Pizza sectiniz");
			break;
		default:
			System.out.println("Yanlış bir secim yaptınız Lütfen S/M/L/XL değerlerinden birini giriniz");
			break;
		}

	}

}
