package VariablesExample;

import java.util.Scanner;

public class BoyKilo {

	public static void main(String[] args) {
		
		double boy;
		int kilo;
		double index;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("L�tfen boyunuzu metre cinsinden giriniz: ");
		boy = scanner.nextDouble();
		
		System.out.print("L�tfen kilonuzu giriniz: ");
		kilo = scanner.nextInt();
		
		index = kilo / (boy * boy);
		System.out.println("V�cut Kitle Endeksiniz: " + index);
				
	}
	
}
