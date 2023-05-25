package com.bilgeadam.lesson018.databaseornek;

import java.util.Scanner;

public class Manager {

	Database database;

	public Manager(Database database) {
		this.database = database;
	}

	public void menu() {

		System.out.println("1-Veri ekle");
		System.out.println("2-Veri sil");
		System.out.println("3-Veri guncelle");
		System.out.println("4-Verileri getir");
		System.out.println("0-Çıkış");
	}

	public void calistir() {
		Scanner scanner = new Scanner(System.in);

		int secim = 0;
		database.login();
		do {

			menu();
			secim = scanner.nextInt();
			switch (secim) {
			case 1:
				database.veriEkle();
				break;
			case 2:
				database.veriSil();
				break;
			case 3:
				database.veriGuncelle();
				break;
			case 4:
				database.verileriGetir();
				break;
			case 0:
				System.out.println("Sistemden cıkılıyor");
				break;
			default:
				break;
			}

		} while (secim != 0);

	}

}
