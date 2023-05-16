package com.bilgeadam.lesson012;

import java.util.Random;
import java.util.Scanner;

/*
 * 
 * Seceneklerimiz enum olsun 
 * 
 * daha sonra bu senecekleri kullanıcıya sunup aralarından bir tanesini secmesini istiyelim 
 * 
 * pc secimi ise random bir şekilde bu 3 senecekden biri olsun 
 * daha sonra sectiğimiz ile pc secimi,ni karşılastrıp kazanıp kazanmadıgızı belirleyelim 
 * 
 * 
 */
public class TasKagitMakas {

	static ESecenek[] secenekler = ESecenek.values();

	public static ESecenek secimYap() {

		for (ESecenek secenek : secenekler) {
			System.out.println((secenek.ordinal() + 1) + "-" + secenek);
		}

		/*
		 * 1-Tas 2-Kagıt 3-Makas
		 */

		;
		int secim = secimKontrol();

		return secenekler[secim - 1];

	}

	public static int secimKontrol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen TAS/KAGIT/MAKAS verilerinden birini seciniz");
		int secim = -1;

		while ((secim = scanner.nextInt()) < 1 || secim > 3) {
			System.out.println("yanlış bir secim yaptınız lutfen tekrar deneyiniz");
		}

//		do {
//			System.out.println("Lütfen 1 ile 3 arası bir sayı giriniz");
//			secim = scanner.nextInt();
//		} while (secim < 1 || secim > 3);

		return secim;
	}

	public static ESecenek pcSecimiYap() {
		Random random = new Random();
		int index = random.nextInt(secenekler.length);// 3 ==> 0,1,2 10==> 0......9
		return secenekler[index];
	}

	public static void oyun() {
		ESecenek secimim = secimYap();
		ESecenek pcSecim = pcSecimiYap();

		if (pcSecim == secimim) {
			System.out.println("Beraberlik");
		} else {
			switch (secimim) {
			case TAS:
				if (pcSecim == ESecenek.KAGIT) {
					System.out.println("Kaybettiniz");

				} else {
					System.out.println("Kazandınız");
				}

				break;
			case KAGIT:
				if (pcSecim == ESecenek.MAKAS) {
					System.out.println("Kaybettiniz");

				} else {
					System.out.println("Kazandınız");
				}

				break;
			case MAKAS:
				if (pcSecim == ESecenek.TAS) {
					System.out.println("Kaybettiniz");

				} else {
					System.out.println("Kazandınız");
				}

				break;

			default:
				break;
			}

		}
		System.out.println("Pc secimi==>" + pcSecim);

	}

}
