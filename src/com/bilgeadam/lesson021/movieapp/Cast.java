package com.bilgeadam.lesson021.movieapp;

public class Cast implements ICrud {
	private String isim;
	private String soyIsim;

	public Cast(String isim, String soyIsim) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	@Override
	public String toString() {
		return "Cast [isim=" + isim + ", soyIsim=" + soyIsim + "]";
	}

	@Override
	public void kayitEt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void guncelle() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sil() {
		// TODO Auto-generated method stub

	}

}
