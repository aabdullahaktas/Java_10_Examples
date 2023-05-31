package com.bilgeadam.lesson021;

public class Test {

	public static void main(String[] args) {
		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
		sansliNumaralar.listeOlustur();

		// sansliNumaralar.map.forEach((k, v) -> System.out.println(k + "=" + v));

//		for (Entry<Integer, Integer> deger : sansliNumaralar.map.entrySet()) {
//			System.out.println(deger.getKey() + "===>" + deger.getValue());

//		}

		// Set<Integer> keySet = sansliNumaralar.map.keySet();
//		int toplam = 0;
//		for (Integer key : sansliNumaralar.map.keySet()) {
//			System.out.println(key + "==>" + sansliNumaralar.map.get(key));
//
//			toplam += sansliNumaralar.map.get(key);
//		}
//
//		System.out.println("toplam uretilen sayı miktarı =" + toplam);

		System.out.println("liste uzunluğu=" + sansliNumaralar.list.size());

		for (Integer sayi : sansliNumaralar.list) {
			System.out.println(sayi);
		}

	}

}
