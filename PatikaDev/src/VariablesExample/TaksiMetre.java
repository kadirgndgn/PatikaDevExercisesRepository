package VariablesExample;

import java.util.Scanner;

public class TaksiMetre {

	public static void main(String[] args) {
	
		double kmTl = 2.20;
		int minimumOdenecek = 20;
		int baslangicOdeme = 10;
		int yol;
		double toplamTutar;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Yol Kaç Km Sürdü? ");
		yol = scanner.nextInt();
		toplamTutar = baslangicOdeme + (kmTl * yol);
		
		if(toplamTutar < 20) {
			System.out.println("Minimum ödeme miktarý 20 liradýr");
			System.out.println("Bu yüzden ödemeniz gereken miktar: "+ minimumOdenecek);
		}
		
		System.out.println("Toplam ödemeniz gereken miktar: " + toplamTutar);
		
	}
	
}
