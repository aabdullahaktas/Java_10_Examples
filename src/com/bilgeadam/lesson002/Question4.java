package com.bilgeadam.lesson002;
/*
 * Bir turk lirası değerimiz olsun bunun başlangıc miktarını belirleyelim
 * 
 * daha sonra bir dolar kuru uzerinden 
 * dolar cınsınden degerini hesaplayalım 
 * 
 * 
 * 
 */
public class Question4 {
	
	public static void main(String[] args) {
		
		int turkLirasi=20;
		
		float dolarKuru=3.14f;
		double guncelDolarKuru=19.42;
		
		System.out.println("Dolar==>"+ turkLirasi/dolarKuru);
		System.out.println("Dolar==>"+ turkLirasi/guncelDolarKuru);

		
	}

}
