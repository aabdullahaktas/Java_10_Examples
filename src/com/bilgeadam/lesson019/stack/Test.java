package com.bilgeadam.lesson019.stack;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.tabakOlustur();
		System.out.println("Kirliler");
		System.out.println(manager.kirliler);
		System.out.println("Temizler");
		System.out.println(manager.temizler);

		manager.temizle();
		manager.temizle();
		manager.temizle();
		manager.temizle();
		manager.temizle();
		manager.temizle();
		manager.temizle();
		manager.temizle();
		manager.temizle();
		manager.temizle();

		System.out.println(manager.temizler);

	}

}
