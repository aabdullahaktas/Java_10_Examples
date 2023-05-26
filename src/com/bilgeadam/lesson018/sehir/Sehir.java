package com.bilgeadam.lesson018.sehir;

import java.util.Random;

public class Sehir implements ISehir {

	private String isim;
	private String plaka;
	private long nufus;

	public Sehir(String isim, String plaka, long nufus) {
		this.isim = isim;
		this.plaka = plaka;
		this.nufus = nufus;
	}

	public Sehir(String isim) {
		this.isim = isim;
		this.nufus = rastgeleNufusUret();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public long getNufus() {
		return nufus;
	}

	public void setNufus(long nufus) {
		this.nufus = nufus;
	}

	@Override
	public String toString() {
		return "Sehir [isim=" + isim + ", plaka=" + plaka + ", nufus=" + nufus + "]";
	}

	@Override
	public String plakaKoduUret(int index) {

		if (index <= 9) {
			this.plaka = "0" + index;
		} else {
			this.plaka = String.valueOf(index);
		}

		// this.plaka = Integer.toString(index);
		return plaka;
	}

	@Override
	public long rastgeleNufusUret() {
		Random random = new Random();
		// this.nufus = random.nextLong(10000, 200000);
		return random.nextLong(10000, 200000);
	}

}
