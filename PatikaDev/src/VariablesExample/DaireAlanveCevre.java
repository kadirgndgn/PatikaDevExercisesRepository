package VariablesExample;

import java.util.Scanner;

public class DaireAlanveCevre {

	public static void main(String[] args) {
		
		double pi = 3.14;
		int yaricap;
		double alan , cevre;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dairenin yar��ap�n� giriniz: ");
		yaricap = scanner.nextInt();
		
		alan = pi * yaricap * yaricap;
		cevre = 2 * pi * yaricap;
		
		System.out.println("Dairenin Alan�: " + alan);
		System.out.println("Dairenin �evresi: " + cevre);
	}
	
}
