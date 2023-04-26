package com.bilgeadam.lesson001;

/*
 * Bir urun fiyatında %18 kdv %15 kar payı oldugunu biliyoruz 
 * 
 * bu ürünün fiyatı elimizde olsun 
 * daha sonra bu fiyat uzerinden 
 * urunun 
 * ham fiyatı 
 * ve kdvsiz fiyatını bulalım 
 * 
 * 
 * 
 */


public class Question3 {
	
	
	public static void main(String[] args) {
		
		int fiyat=100;
		float hamFiyat,kdvsizFiyat;
		
		kdvsizFiyat=fiyat/1.18f;
		hamFiyat=kdvsizFiyat/1.15f;
		
		System.out.println("urunun kdvsiz fiyatı:" + kdvsizFiyat);
		System.out.println("urunun ham fiyatı:" + hamFiyat);
		
	}

}
