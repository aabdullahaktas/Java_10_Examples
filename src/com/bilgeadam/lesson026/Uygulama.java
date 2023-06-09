package com.bilgeadam.lesson026;

import java.time.LocalDate;
import java.util.Arrays;

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
 *  3- yukyerisec2 --> eger sectiğmiz yer sınırlar dısında ise  sınırlar dısında hatasını 
 *  fırlatsın eger sectiğimiz yer dolu ise dolu yer secimi hatasını fırlatsın
 *  ---------Odev-----
 *  
 *  4- tarihbelirle metodu yazalım---> utilitydeki tarhi deger alma kullanılabilinir
 *  -- a)eger geçmiş tarih girilmişşe  Gecersiz kabul tarhi hatası fırlatsın
 *  	b)girdiğimiz gun  cumartesi veya pazar ise mesai gunleri dısı hatası versin 
 *  
 *  5- yukOlusturmetodu yazalım==> dısarıdan bir isim agırlıkalacagız ve tarih alacagız 
 *  -- agırlık ve tarihi yazdıgımız metotlar uzerinden alacagız 
 *  --eger hata yoksa bize bir tane yuk donsun 
 *  --eger hata var ise bize bos bir optional donsun 
 *   
 *   6- bu metotlarıda bir yuk kabulu metotlarında toplayıp butun kontrolleimden geçmiş ise
 *   -- basta aldığım index degerine yuku setleyelim 
 *   -- yukyerisec2, yukolustur bu iki metoto basarılı çalışmıssa yuk olusturdan donen yuku 
 *   limandaki yukler arayına index degeri ile setleyeceğiz
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
		// uygulama.yukYeriSec(yuk);

//		try {
//			int index = uygulama.yukyeriSec2();
//			uygulama.liman.getYukler()[index] = yuk;
//		} catch (LimanException e) {
//			e.printStackTrace();
//		}

		try {
			uygulama.agirlikBelirle();
		} catch (LimanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Arrays.toString(uygulama.liman.getYukler()));

		System.out.println("Program devam ediyor");

	}

	public void yukYeriSec(Yuk yuk) {

		int index = Utility.intDegerAlma("Lutfen bir yuk yeri seciniz");
		try {
			if (liman.getYukler()[index] != null) {
				throw new LimanException(ErrorType.DOLU_YER_SECIMI);
			} else {

				liman.getYukler()[index] = yuk;
				System.out.println("işlem başarılı");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Yuk yeri secimi başırısız");
		}

	}

	public int yukyeriSec2() throws LimanException {

		int index = Utility.intDegerAlma("Lütfen bir yuk yeri seciniz");

		if (liman.getYukler().length <= index || index < 0) {
			throw new LimanException(ErrorType.SINIRLAR_DISINDA);
		}
		if (liman.getYukler()[index] != null) {

			throw new LimanException(ErrorType.DOLU_YER_SECIMI);
		}

		return index;
	}

	public double agirlikBelirle() throws LimanException {

		double agirlik = Utility.doubleDegerAlma("Lütfen bir agırlık belirleyiniz");

		if (agirlik < 100) {
			throw new LimanException(ErrorType.YETERSIZ_AGIRLIK);
		}

		return agirlik;
	}

}
