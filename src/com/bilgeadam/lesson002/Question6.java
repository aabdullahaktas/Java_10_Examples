package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * Dairenin alanını ve çevresini hesaplayan bir program yazacağız
 * 
 * dışarıdan yarıçap bilgisini alalım 
 * 
 * alan=pi*r*r
 * çevre=2*pi*r
 * 
 * 
 */

public class Question6 {
	
	public static void main(String[] args) {
		
		double pi=3.14,yariCap,cevre,alan;

		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Lütfen bir yarı cap bilgisi giriniz");
		yariCap=input.nextDouble();
		
		cevre=pi*yariCap*2;
		alan=pi*yariCap*yariCap;
		
		System.out.println("Dairenin alanı= "+alan+"\nDairenin çevresi= "+cevre);
		
		
		
	}
	
	

}
