package VariablesExample;

import java.util.Scanner;

public class DikÜcgenHipotenüs {

	public static void main(String[] args) {
		
		int birinciKenar; 
		int ikinciKenar;
		double hipotenüs;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Üçgenin ilk kenar uzunluðunu giriniz: ");
		birinciKenar = scanner.nextInt();
		
		System.out.print("Üçgenin ikinci kenarýný giriniz: ");
		ikinciKenar = scanner.nextInt();
		
		hipotenüs = Math.sqrt((birinciKenar*birinciKenar) + (ikinciKenar*ikinciKenar));
		System.out.println("Hipotenüs deðeri: " + hipotenüs);
		
	}
	
}
