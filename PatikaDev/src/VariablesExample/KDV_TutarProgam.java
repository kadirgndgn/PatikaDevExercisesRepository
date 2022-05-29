package VariablesExample;

import java.util.Scanner;

public class KDV_TutarProgam {
	
	public static void main(String[] args) {
		double kdvsiz = 0.18;
		double kdvli;
		int fiyat;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen ürünün kdv'siz fiyatýný giriniz: ");
		fiyat = scanner.nextInt();
		
		kdvli = fiyat + (kdvsiz * fiyat);
		
		System.out.println("Ürünün Kdv'siz fiyatý: " + fiyat);
		System.out.println("Ürünün Kdv'li fiyatý: " + kdvli);
		
	}
	
}
