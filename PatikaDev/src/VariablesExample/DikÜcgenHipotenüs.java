package VariablesExample;

import java.util.Scanner;

public class Dik�cgenHipoten�s {

	public static void main(String[] args) {
		
		int birinciKenar; 
		int ikinciKenar;
		double hipoten�s;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��genin ilk kenar uzunlu�unu giriniz: ");
		birinciKenar = scanner.nextInt();
		
		System.out.print("��genin ikinci kenar�n� giriniz: ");
		ikinciKenar = scanner.nextInt();
		
		hipoten�s = Math.sqrt((birinciKenar*birinciKenar) + (ikinciKenar*ikinciKenar));
		System.out.println("Hipoten�s de�eri: " + hipoten�s);
		
	}
	
}
