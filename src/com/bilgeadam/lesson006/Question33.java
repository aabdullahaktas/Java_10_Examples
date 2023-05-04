package com.bilgeadam.lesson006;

public class Question33 {

	public static void main(String[] args) {

		int sayi1 = 10;
		Integer sayi2;
		sayi2 = sayi1;
		sayi2 = Integer.valueOf(sayi1);
		double sayi3 = 15.4;
		Double sayi4 = Double.valueOf(sayi3);

		Integer[] array = new Integer[4];
		for (int i = 1; i < 4; i++) {
			array[i] = i;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		String a = Integer.valueOf(sayi1).toString();
		String b = Integer.toString(sayi1);
		System.out.println(a);
		System.out.println(b);

		// bir String değeri bir sayısal değere donusturmek için parse()
		// metodu kullanılır
		String deger = "123";
		int sayi5 = Integer.parseInt(deger);

		System.out.println(sayi5);
		double sayi6 = Double.parseDouble(deger);
		long sayi7 = Long.parseLong(deger);
		char sayi8 = (char) Integer.parseInt(deger);
		char karakter = 'a';
		String deger2 = Character.toString(karakter);

	}
}
