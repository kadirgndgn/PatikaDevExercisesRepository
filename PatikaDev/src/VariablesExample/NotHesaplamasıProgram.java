package VariablesExample;

import java.util.Scanner;

public class NotHesaplamas�Program {

	public static void main(String[] args) {
	
		int firstExam;
		int secondExam;
		double average;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("L�tfen vize notunuzu giriniz: ");
		firstExam = scanner.nextInt();
		
		System.out.print("L�tfen final notunuzu giriniz: ");
		secondExam = scanner.nextInt();
		
		average = ((firstExam * 0.4) + (secondExam * 0.6));
		System.out.print("Not Ortalaman�z: " + average);
		
	}	
	
}
