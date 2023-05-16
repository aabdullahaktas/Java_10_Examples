package com.bilgeadam.lesson011.enums;

public class EnumTest {

	public static void main(String[] args) {

		EAylar haziran = EAylar.HAZIRAN;

//	Stringe çevirme metotları
		String haziranString = EAylar.HAZIRAN.toString();
		String haziranString2 = EAylar.HAZIRAN.name();

		System.out.println(haziran);
		System.out.println(haziranString);
		System.out.println(haziranString2);
// Enumun sırasını bir int deger olark alma yani indexini alma 
		System.out.println(EAylar.HAZIRAN.ordinal());
		System.out.println(EAylar.TEMMUZ.ordinal());
		System.out.println(EAylar.AGUSTOS.ordinal());

		// bir strini eneumna çevirme
		String ay = "temmuz";

		EAylar enumAy = EAylar.valueOf(ay.toUpperCase());
		System.out.println(enumAy);

		// Bir enum yapısnı araya çevirme

		EAylar[] dizi = EAylar.values();
		System.out.println("=======================");
		for (EAylar ay1 : dizi) {
			if (ay1.gun == 30 && ay1.mevsim.equalsIgnoreCase("yaz")) {
				System.out.println((ay1.ordinal() + 1) + "-" + ay1.toString());
				System.out.println(ay1.mevsimGetir());
			}

		}

	}
}
