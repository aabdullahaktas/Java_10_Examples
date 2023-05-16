package com.bilgeadam.lesson009;

public class Question45 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 1. yontem
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 6 - i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		// 2. yontem
		for (int i = 6; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
