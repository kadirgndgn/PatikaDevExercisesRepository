package VariablesExample;

import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		
		double armutFiyat = 2.14, elmaFiyat = 3.67;
		double domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5;
		double toplamTutar;
		
		int armut, elma, domates, muz, patlican;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Armut Ka� Kilogram? ");
		armut = scanner.nextInt();
		
		System.out.print("Elma Ka� Kilogram? ");
		elma = scanner.nextInt();
		
		System.out.print("Domates Ka� Kilogram? ");
		domates = scanner.nextInt();
		
		System.out.print("Muz Ka� Kilogram? ");
		muz = scanner.nextInt();
		
		System.out.print("Patl�can Ka� Kilogram? ");
		patlican = scanner.nextInt();
		
		toplamTutar = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat);
		System.out.println("Toplam �demeniz Gereken Tutar: " + toplamTutar + " Tl");
	}
	
}
