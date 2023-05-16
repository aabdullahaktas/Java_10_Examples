package com.bilgeadam.lesson009;

public class Question47 {

	public static void main(String[] args) {

		// karakterSayici("Bugün güzel bir gün", 'i');
		System.out.println(karakterSayici("Bugün güzel bir gün", 'i'));
	}

	public static int karakterSayici(String ifade, char karakter) {

		int sayac = 0;

		for (int i = 0; i < ifade.length(); i++) {

			if (ifade.charAt(i) == karakter) {
				sayac++;
			}
		}
		System.out.println("metot içindeki yazdırma= " + sayac);
		return sayac;

	}

}
