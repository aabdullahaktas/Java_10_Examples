package com.bilgeadam.lesson018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Integer[] array2 = (Integer[]) list1.toArray();
//		Integer[] array3 = (Integer[]) list2.toArray();

		String[] array = { "Ankara", "İstanbul" };

		List<String> list3 = Arrays.asList(array);
		System.out.println(list3.size());
		System.out.println(list3.get(1));

		list1.add(5);
		list2.add(15);

		System.out.println(list1.size());
		System.out.println(list1.get(0));
		// System.out.println(list1.get(1));

	}

}
