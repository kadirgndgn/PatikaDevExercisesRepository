package VariablesExample;

import java.util.Scanner;

public class KDV_TutarProgam {
	
	public static void main(String[] args) {
		double kdvsiz = 0.18;
		double kdvli;
		int fiyat;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("L�tfen �r�n�n kdv'siz fiyat�n� giriniz: ");
		fiyat = scanner.nextInt();
		
		kdvli = fiyat + (kdvsiz * fiyat);
		
		System.out.println("�r�n�n Kdv'siz fiyat�: " + fiyat);
		System.out.println("�r�n�n Kdv'li fiyat�: " + kdvli);
		
	}
	
}
