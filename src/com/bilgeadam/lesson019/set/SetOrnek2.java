package com.bilgeadam.lesson019.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * dışarıdan bir kelime girelim her harfini bir sete atmak istiyoruz 
 * tekrar edenleri bir sete terkara etmeyenleri başka bir sete atalım 
 * sonra tekrar eden ve etmeyen setlerini yazdıralım 
 * 
 * 
 */

public class SetOrnek2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scanner.nextLine();
		Set<Character> tekrarEden = new HashSet<>();
		Set<Character> tekrarEtmeyen = new HashSet<>();

		for (int i = 0; i < kelime.length(); i++) {
			if (!tekrarEden.contains(kelime.charAt(i)) && !tekrarEtmeyen.add(kelime.charAt(i))) {
				tekrarEden.add(kelime.charAt(i));
				tekrarEtmeyen.remove(kelime.charAt(i));
			}
		}

		System.out.println("Tekrar eden");
		System.out.println(tekrarEden);

		System.out.println("Tekrar etmeyen");
		System.out.println(tekrarEtmeyen);

	}

}
