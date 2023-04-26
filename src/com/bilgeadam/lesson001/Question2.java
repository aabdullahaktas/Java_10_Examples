package com.bilgeadam.lesson001;
/*
 * iki tane string değişkenimiz olsun isim ve soy ismi bu değişkenlerde tutalım 
 * daha sonra bir yas değişkenimiz olsun yaşımızıda bu değişkende tutalım 
 * sizden bunun sonucunda soyle bir cıktı istiyorum
 * 
 * Mustafa Ozturk - 35  
 * 
 * 
 * 
 */
public class Question2 {
	
	
	public static void main(String[] args) {
		
		int yas=35;
		String isim="Mustafa";
		String soyIsim="Öztürk";
	
		System.out.println(isim+" "+soyIsim+" - "+yas);
		String sonuc=isim+"\n"+soyIsim+"\n"+yas;
		String sonuc2=isim+"\t\t\t"+soyIsim+"\t"+yas;
		System.out.println(sonuc);
		System.out.println(sonuc2);
		
		
	}

}
