package com.bilgeadam.lesson032.factory.pizzaApp;

public class PizzaSiparis {

	public void menu() {

		System.out.println("Pizza Sipariş Menusu");
		Pizza pizza = pizzaSec();
		sipraisHazirlama(pizza);

	}

	/*
	 * turu hamur tipini ve boyutu secip bir factory sınıfına yollayıp bize bir
	 * pizza donmesini istiyoruz
	 * 
	 * turu ve hamurtipini secelim
	 * 
	 * pizza Factory sınfında bir pizza olustur metodu yazıp bu metotdan aldıgımız
	 * verilerle bir pizza olustrup geri donelim
	 * 
	 * 
	 */
	private Pizza pizzaSec() {
		EBoyut boyut = boyutsec();

		return null;
	}

	public EBoyut boyutsec() {
		for (EBoyut boyut : EBoyut.values()) {
			System.out.println((boyut.ordinal() + 1) + "-" + boyut);
		}

		int secim = Utility.intDegerAlma("Lütfen bir pizza boyutu seciniz");

		return EBoyut.values()[secim - 1];
	}

	private void sipraisHazirlama(Pizza pizza) {
		System.out.println("Siparişiniz ===>" + pizza);
		System.out.println("Hazırlanıyor.....");

	}

}
