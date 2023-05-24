package com.bilgeadam.lesson017;

/*
 * 
 * ucaklarda hiz 50 ser 50ser artsın  ve azalsın
 * gemilerde hiz 10 ar 10 ar artsın ve azalsın 
 * otomobillerde hız 20ser 20ser artsın ve azalsın 
 * kamyonlarda hiz 5 er 5er artsın ve azalsin 
 * 
 * 
 * 
 */
public abstract class Arac implements IHareket {

	int hiz;

	public abstract void hizlanma();

	public abstract void yavaslama();

	public void hizGoster() {
		System.out.println("hızınız===>" + hiz);
	}

	@Override
	public String toString() {
		return "Arac [hiz=" + hiz + "]";
	}

}
