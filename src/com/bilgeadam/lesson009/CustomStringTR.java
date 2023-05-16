package com.bilgeadam.lesson009;

public class CustomStringTR {

	public static int uzunlukBul(String ifade) {

		return ifade.length();
	}

	public static boolean iceriyorMu(String ifade, String kelime) {

		return ifade.contains(kelime);

	}

	public static boolean icerigiAynıMı(String ifade1, String ifade2) {
		return ifade1.equals(ifade2);
	}

	public static String harfleriBuyut(String ifade) {
		return ifade.toUpperCase();
	}

	public static String harfleriKucult(String ifade) {
		return ifade.toLowerCase();
	}

	public static String ayirma(String ifade, int index) {

		return ifade.substring(index);
	}

	public static String ayirma(String ifade, int start, int end) {

		return ifade.substring(start, end);
	}

	public static String birlestirme(String ifade1, String ifade2) {

		return ifade1.concat(ifade2);
	}

	public static char indexdekiKarakteriBul(String ifade, int index) {
		return ifade.charAt(index);
	}

	public static int karakterinIndexiniBulma(String ifade, char karakter) {

		return ifade.indexOf(karakter);
	}

	public static String karakterDeğiştir(String ifade, char eskiKarakter, char yeniKarakter) {

		return ifade.replace(eskiKarakter, yeniKarakter);
	}

	public static void main(String[] args) {
		System.out.println(uzunlukBul("Merhaba"));
		System.out.println(iceriyorMu("Merhaba", "ha"));
		System.out.println(icerigiAynıMı("Merhaba", "Merhaba"));
		System.out.println(harfleriBuyut("Merhaba"));
		System.out.println(harfleriKucult("Merhaba"));
		System.out.println(ayirma("Merhaba", 3));
		System.out.println(ayirma("Merhaba", 3, 5));
		System.out.println(birlestirme("Merhaba", " Dünya"));
		System.out.println(indexdekiKarakteriBul("Merhaba", 0));
		System.out.println(karakterinIndexiniBulma("Merhaba", 'r'));
		System.out.println(karakterDeğiştir("Merhaba", 'a', 'x'));
	}

}
