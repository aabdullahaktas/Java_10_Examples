package com.bilgeadam.lesson014;

public class Sepet {

	private EUrun[] urunler;
	private double totalPrice;

	public Sepet() {
		this.urunler = new EUrun[10];
	}

	// alt +shif+ s
	public EUrun[] getUrunler() {
		return urunler;
	}

	public void setUrunler(EUrun[] urunler) {
		this.urunler = urunler;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
