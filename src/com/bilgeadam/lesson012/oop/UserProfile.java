package com.bilgeadam.lesson012.oop;

import java.util.Random;

public class UserProfile {

	String avatar;
	String username;
	String name;
	String surName;
	int followers;
	Integer following;
	double repositories;

	public void editProfile() {

		System.out.println(name + " Profilini düzenledi");
	}

	public void createRepository() {
		System.out.println("Yeni bir repository olusturuldu");
	}

	public void randomFollowers() {
		Random random = new Random();
		followers = random.nextInt(1, 100000000);
	}

	public void getInformation() {
		System.out.println("=======Profil Bilgileri======");
		System.out.println("isim soyisim= " + name + " " + surName);
		System.out.println("kullanıcı ismi= " + username);
		System.out.println("followers= " + followers);
		System.out.println("following= " + following);
		System.out.println("repositories= " + repositories);
		System.out.println("-------------------------------");

	}

}
