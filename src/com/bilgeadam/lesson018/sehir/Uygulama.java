package com.bilgeadam.lesson018.sehir;

import java.util.ArrayList;

/*
 * sehir sınfında isim plaka ve nufus degerleimiz olsun 
 *  plaka kodu uret diye bir metot 01,02...09,10,11
 *  rastgelenufusolustur diye bir metot yazalım 
 * 
 * 
 * uygulama sınıfında bir sehir listesi olusturacagız 
 * bir sehirleri olustur metodu ile string arrayden gelen verilei sehir nesnesine cevirip
 * sehiler listesine ekleyeceğiz
 * 
 */
public class Uygulama {

	ArrayList<Sehir> sehirler;

	public Uygulama() {
		this.sehirler = new ArrayList<>();
	}

	public void sehirOlustur() {
		// this.sehirler = new ArrayList<>();
		for (int i = 0; i < SehirDatabase.iller.length; i++) {
			String isim = SehirDatabase.iller[i];
			Sehir sehir = new Sehir(isim);
			// sehir.setNufus(sehir.rastgeleNufusUret());
			// sehir.rastgeleNufusUret();
			sehir.plakaKoduUret(i + 1);
			sehirler.add(sehir);
		}

	}

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		uygulama.sehirOlustur();
		System.out.println(uygulama.sehirler);

	}

}
