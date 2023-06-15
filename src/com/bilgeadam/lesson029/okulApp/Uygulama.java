package com.bilgeadam.lesson029.okulApp;

/*
 * ogrenci sınıfımızda
 * isim notort durumu==> (geçti veya kaldı),dogumtarihi 
 * ögretmen sınımıfımız olsun==>
 * bir ismi olsun birde notlarını okudugu ogrencileri tutsun 
 * 
 * Fİle manager
 * 1- dosyadan verileri okuyalaım  ve bize bir ogrenci listesi donsun 
 * ---> gelen her degerden bir ogrenci yaratıp listeye ekleyecegiz 
 * -->en sonunda da listeyi geri doncegiz 
 * 
 *2-ogretmen dosyası olustur ==> ogretmen ismi ile bir dosya olusturp gelen 
 *listeyi bu dosyaya yazdıralım
 *
 *3-ogrencileriGetir diye bir metot yazalım dosyadan ogrencileri 
 *okuyup bir liste donsun(hangi dosyadan okuyuacagını belirtmemeiz lazım) 
 * 
 * 
 */
public class Uygulama {

	public static void main(String[] args) {

		Ogretmen ogretmen1 = new Ogretmen("Berkin");
		Ogretmen ogretmen2 = new Ogretmen("Mustafa");

		ogretmen1.start();
		ogretmen2.start();

		// ogretmen.notlariOku();
		// ogretmen.getOgrenciler().forEach(System.out::println);
		// ogretmen.dosyaOlustur();

//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
//
//		List<Ogrenci> list = ogretmen.getOgrenciler().stream().map(x -> {
//			x.setOrt(x.getOrt() + 5);
//			x.durumBelirle(x.getOrt());
//			return x;
//		}).collect(Collectors.toList());
//		ogretmen.setOgrenciler(list);
//		ogretmen.getOgrenciler().forEach(System.out::println);
//		ogretmen.dosyaOlustur();
//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
		// dosyadanVeriOku("Mustafa").forEach(System.out::println);

	}

}
