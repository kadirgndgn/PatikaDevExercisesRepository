package VariablesExample;

import java.util.Scanner;

public class BoyKilo {

	public static void main(String[] args) {
		
		double boy;
		int kilo;
		double index;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
		boy = scanner.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = scanner.nextInt();
		
		index = kilo / (boy * boy);
		System.out.println("Vücut Kitle Endeksiniz: " + index);
				
	}
	
}
