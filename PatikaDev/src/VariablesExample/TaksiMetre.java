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
		
		System.out.print("Yol Ka� Km S�rd�? ");
		yol = scanner.nextInt();
		toplamTutar = baslangicOdeme + (kmTl * yol);
		
		if(toplamTutar < 20) {
			System.out.println("Minimum �deme miktar� 20 lirad�r");
			System.out.println("Bu y�zden �demeniz gereken miktar: "+ minimumOdenecek);
		}
		
		System.out.println("Toplam �demeniz gereken miktar: " + toplamTutar);
		
	}
	
}
