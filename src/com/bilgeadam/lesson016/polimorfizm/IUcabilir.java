package com.bilgeadam.lesson016.polimorfizm;

public interface IUcabilir {

	void havalan();

	void inisYap();

	default void deneme() {
		int sayı = 5;
		System.out.println(sayı + "deneme");
	}

}
