package com.bilgeadam.lesson026;

import java.time.LocalDate;

/*
 *1- Bir limanımız olacak bu limanada yuk yerleştirlcek alanlar olacak 
 *  limandaki yuk yerleştilecek alan sayısı liman olusturulurken belirlenebilir
 *  veya her liman için 10 adet yk yeri olabilir
 *   her yukun bir agırlık bir kabul tarıhi olsun 
 *  
 *   2-Kendi exception sınıfımız yartalım ve uygulamamızda bir yukyeri sec metodu yapalım 
 *   --eger sectiğimiz yer dolu ise doluyer secimi diye bir hata fırlatsın 
 *   -- bir limandaki iki yeri default olarak dolduralım 
 *   --daha sonra yuk yeri sec metodunu çalıştıralım 
 *  
 */
public class Uygulama {

	Liman liman;

	public Uygulama() {
		this.liman = new Liman();
	}

	public static void main(String[] args) {

		Yuk yuk = new Yuk("Yuk1", 1000, LocalDate.now());
		Uygulama uygulama = new Uygulama();
		uygulama.liman.getYukler()[3] = new Yuk("Yuk3", 100, LocalDate.now().minusDays(5));
		uygulama.liman.getYukler()[5] = new Yuk("Yuk5", 100, LocalDate.now().minusWeeks(2));
		uygulama.yukYeriSec(yuk);
		System.out.println("Program devam ediyor");

	}

	public void yukYeriSec(Yuk yuk) {

		int index = Utility.intDegerAlma("Lutfen bir yuk yeri seciniz");
		try {
			if (liman.getYukler()[index] != null) {
				throw new LimanException("Dolu yer seçimi");
			} else {

				liman.getYukler()[index] = yuk;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Yuk yeri secimi başırısız");
		}

	}
}
