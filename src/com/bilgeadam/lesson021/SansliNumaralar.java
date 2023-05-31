package com.bilgeadam.lesson021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SansliNumaralar {

	Map<Integer, Integer> map;
	List<Integer> list;

	/*
	 * 20=4 30=2 1=14 35=2
	 * 
	 */

	public SansliNumaralar() {
		map = new HashMap<>();
		list = new ArrayList<>();
	}

	public void mapOlustur() {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			int sayi = random.nextInt(1, 101);
			if (!map.containsKey(sayi)) {
				map.put(sayi, 1);
			} else {
				map.replace(sayi, map.get(sayi) + 1);
			}

		}

	}

	public void listeOlustur() {
		for (Integer key : map.keySet()) {
			int value = map.get(key);
			for (int i = 0; i < value; i++) {
				list.add(key);
			}
		}
	}

}
