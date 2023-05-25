package com.bilgeadam.lesson018.databaseornek;

public class MySql extends Database {

	@Override
	public void veriEkle() {
		System.out.println("Mysql veri tabanına veri eklendi");

	}

	@Override
	public void veriSil() {
		System.out.println("Mysql veri tabanından veri silindi");

	}

	@Override
	public void veriGuncelle() {
		System.out.println("Mysql veri tabanında veri guncellendi");

	}

	@Override
	public void verileriGetir() {
		System.out.println("Mysql veri tabanından veriler getirildi");

	}

	@Override
	public void login() {
		System.out.println("Mysql veri tabanına  bağlanıldı");

	}

}
