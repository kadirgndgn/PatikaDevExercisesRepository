package VariablesExample;

import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		
		double armutFiyat = 2.14, elmaFiyat = 3.67;
		double domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5;
		double toplamTutar;
		
		int armut, elma, domates, muz, patlican;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilogram? ");
		armut = scanner.nextInt();
		
		System.out.print("Elma Kaç Kilogram? ");
		elma = scanner.nextInt();
		
		System.out.print("Domates Kaç Kilogram? ");
		domates = scanner.nextInt();
		
		System.out.print("Muz Kaç Kilogram? ");
		muz = scanner.nextInt();
		
		System.out.print("Patlýcan Kaç Kilogram? ");
		patlican = scanner.nextInt();
		
		toplamTutar = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat);
		System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplamTutar + " Tl");
	}
	
}
