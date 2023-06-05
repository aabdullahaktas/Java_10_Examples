package com.bilgeadam.lesson023;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOrnek {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
//		System.out.println(date.getDay());
//		System.out.println(date.getDate());
//		System.out.println(date.getYear());

		LocalDate date1 = LocalDate.now();
		LocalDateTime date2 = LocalDateTime.now();
		System.out.println(date1);
		System.out.println(date2);
		LocalDate date3 = LocalDate.of(2001, 06, 10);
		LocalDate date4 = LocalDate.of(2001, Month.OCTOBER, 10);
		System.out.println(date4);
		System.out.println(date3);
		System.out.println(date3.getDayOfMonth());
		System.out.println(date3.getYear());
		System.out.println(date3.getDayOfYear());// yıldaki kaçıncı gun oldugunu getiriyor
		System.out.println(date3.getMonthValue());
		System.out.println(date3.getDayOfWeek());// gunun degerini veirir
		System.out.println(date3.getDayOfWeek().getValue()); // haftanın kacıncı gunu
		System.out.println(date3.isLeapYear()); // artık yıl mı
		System.out.println(date3.plusYears(2));
		System.out.println(date3.plusMonths(2));
		System.out.println(date3.plusDays(2));
		System.out.println(date3.plusWeeks(2));
		System.out.println(date3.minusYears(2));
		System.out.println(date3.minusMonths(2));
		System.out.println(date1.isBefore(date3));
		System.out.println(date1.isAfter(date3));
		System.out.println(date3.isAfter(date1));
		System.out.println(date3.isEqual(date1));
		LocalDate date5 = LocalDate.parse("2022-12-15"); // yıl-ay-gun
		System.out.println(date5.getDayOfYear());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");
		String date6 = LocalDate.now().format(formatter);
		System.out.println(date6);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyy H:mm");
		LocalDateTime date7 = LocalDateTime.parse("15/05/2022 15:16", formatter2);
		System.out.println(date7);

		LocalDate date8 = LocalDate.now();
		LocalDate date9 = LocalDate.parse("2022-06-05");
		long ay = date9.until(date8, ChronoUnit.MONTHS);
		System.out.println("ay==>" + ay);
		long gun = date9.until(date8, ChronoUnit.DAYS);
		System.out.println("gun==> " + gun);
		long gun2 = date8.until(date9, ChronoUnit.DAYS);
		System.out.println("gun==> " + gun2);
		long yıl = date9.until(date8, ChronoUnit.YEARS);
		System.out.println("yıl==> " + yıl);
		long hafta = date9.until(date8, ChronoUnit.WEEKS);
		System.out.println("hafta==> " + hafta);
		long yıl2 = ChronoUnit.YEARS.between(date9, date8);
		System.out.println(yıl2);

	}

}
