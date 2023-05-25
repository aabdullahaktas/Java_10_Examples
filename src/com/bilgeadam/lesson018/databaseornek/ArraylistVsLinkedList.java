package com.bilgeadam.lesson018.databaseornek;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArraylistVsLinkedList {

	public static void main(String[] args) {

		//
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		long baslangıc = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			arrayList.add(i);
		}
		long bitis = System.nanoTime();
		long arraylistSuresi = bitis - baslangıc;

		baslangıc = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			linkedList.add(i);
		}
		bitis = System.nanoTime();
		long linkedlistSuresi = bitis - baslangıc;

		System.out.println("arraylist===>" + arraylistSuresi);
		System.out.println("linkedlist===>" + linkedlistSuresi);

		//// Rastgele erişim
		Random random = new Random();
		long index = random.nextLong(10000000);
		/// arraylist
		baslangıc = System.nanoTime();
		arrayList.get((int) index);
		bitis = System.nanoTime();
		arraylistSuresi = bitis - baslangıc;
		// linked list
		baslangıc = System.nanoTime();
		linkedList.get((int) index);
		bitis = System.nanoTime();
		linkedlistSuresi = bitis - baslangıc;
		System.out.println("=========================");
		System.out.println("arraylist===>" + arraylistSuresi);
		System.out.println("linkedlist===>" + linkedlistSuresi);

		//// Araya veri ekleme

		long index2 = random.nextLong(10000000);
		/// arraylist
		baslangıc = System.nanoTime();
		arrayList.remove((int) index);
		bitis = System.nanoTime();
		arraylistSuresi = bitis - baslangıc;
		// linked list
		baslangıc = System.nanoTime();
		linkedList.remove((int) index);
		bitis = System.nanoTime();
		linkedlistSuresi = bitis - baslangıc;
		System.out.println("=========================");
		System.out.println("arraylist===>" + arraylistSuresi);
		System.out.println("linkedlist===>" + linkedlistSuresi);

	}
}
