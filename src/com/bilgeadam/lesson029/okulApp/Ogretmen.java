package com.bilgeadam.lesson029.okulApp;

import java.util.ArrayList;
import java.util.List;

public class Ogretmen extends Thread {

	private String isim;
	private List<Ogrenci> ogrenciler;

	public Ogretmen(String isim) {
		this.isim = isim;
		this.ogrenciler = new ArrayList<>();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}

	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}

	public void notlariOku() {
		this.ogrenciler = FileManager.dosyadanVeriOku(this.isim);
	}

	public void dosyaOlustur() {
		FileManager.ogretmenDosyasıOlustur(ogrenciler, isim);

	}

	public List<Ogrenci> dosyadanOgrencileriGetir() {
		this.ogrenciler = FileManager.ogrencileriGetir(isim);
		return ogrenciler;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(this.isim + "===>" + (i + 1) + ". ögrencinin notunu okudu ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public String toString() {
		return "Ogretmen [isim=" + isim + ", ogrenciler=" + ogrenciler + "]";
	}

}
