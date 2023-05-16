package com.bilgeadam.lesson009;

public class Question46 {

	public static void main(String[] args) {

		int sayiDizisi[] = { 9, 7, 5, 7, 7, 3, 5, 18, 2, 5, 0, 7 };

		ilkTekrarEdenSayiyiBul2(sayiDizisi);

	}

	public static void ilkTekrarEdenSayiyiBul(int[] dizi) {

		int sayac = 1;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					sayac++;
				}
			}
			if (sayac > 1) {
				System.out.println("tekrar eden sayımız= " + dizi[i]);
				System.out.println("tekrar sayımız= " + sayac);
				break;

			}
		}

		if (sayac == 1) {
			System.out.println("Tekrar eden sayi bulunamadı");
		}

	}

	public static void ilkTekrarEdenSayiyiBul2(int[] dizi) {
		int sayac = 0;

		Integer tekrarEdenSayi = null;

		for (int i = 0; i < dizi.length; i++) {
			System.out.println(i);
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					tekrarEdenSayi = dizi[i];
					break;
				}
			}
			if (tekrarEdenSayi != null) {
				break;
			}

		}

		if (tekrarEdenSayi == null) {
			System.out.println("Tekrar eden sayi bulunamadı");
		} else {
			for (int i = 0; i < dizi.length; i++) {
				if (dizi[i] == tekrarEdenSayi) {

					sayac++;
				}
			}

			System.out.println("tekrar eden sayımız= " + tekrarEdenSayi);
			System.out.println("tekrar sayımız= " + sayac);

		}

	}

}
