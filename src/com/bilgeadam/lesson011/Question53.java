package com.bilgeadam.lesson011;

/*
 * 
 * Türkçe karakterleri inglizce karakterler çevirme
 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' 
bir metot ile bu işlemi yapalım metot içerisinde dıaşırıdan bir kelime alacagız 
bu kelime içerisinde geçen türkçe karakterleri ing karakterlere dönüştüreceğiz ve geri döneceğiz;
bu soruyu çözerken arrayler kullanabilirsiniz ve string metotlarından yardım alabilirsiniz? 
Örnek çıktı Şeker➔Seker gibi çalı➔ cali gib
 * 
 * 
 */
public class Question53 {

	public static void main(String[] args) {
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };

		trToEng2(turkceKarakter, ingilizceKarakter, "şeker");

	}

	public static void trToEng(String[] turkceKarakter, String[] ingilizceKarakter, String ifade) {

		for (int i = 0; i < ingilizceKarakter.length; i++) {
			ifade = ifade.replace(turkceKarakter[i], ingilizceKarakter[i]);
		}

		System.out.println(ifade);

	}

	public static void trToEng2(String[] turkceKarakter, String[] ingilizceKarakter, String ifade) {

		for (int i = 0; i < turkceKarakter.length; i++) {
			if (ifade.contains(turkceKarakter[i])) {
				ifade = ifade.replace(turkceKarakter[i], ingilizceKarakter[i]);
			}
		}

		System.out.println(ifade);

	}
}
