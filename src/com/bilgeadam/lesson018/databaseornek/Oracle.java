package com.bilgeadam.lesson018.databaseornek;

public class Oracle extends Database {

	@Override
	public void veriEkle() {
		System.out.println("Oracle veri tabanına veri eklendi");

	}

	@Override
	public void veriSil() {
		System.out.println("Oracle veri tabanından veri silindi");

	}

	@Override
	public void veriGuncelle() {
		System.out.println("Oracle veri tabanında veri guncellendi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Oracle veri tabanından veriler getirildi");

	}

	@Override
	public void login() {
		System.out.println("Oracle veri tabanına  bağlanıldı");

	}
}
