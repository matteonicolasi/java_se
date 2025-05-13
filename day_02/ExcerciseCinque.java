package day_02;

import java.util.Scanner;

public class ExcerciseCinque {

	public static void main(String[] args) {
//		Conversione di temperatura
//		Traccia: Scrivi un programma Java che chieda all'utente di inserire una
//		temperatura in gradi Celsius e stampi la corrispondente temperatura in
//		gradi Fahrenheit. Utilizza la formula: Fahrenheit = Celsius * 9/5 + 32.
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Inserisci la temperatura in gradi Celsius: ");
	        double t = scanner.nextDouble();
	        double f = t * 9/5 +32;
	        System.out.println("La temperatura in gradi Fahrenheit è: " + f);
	        scanner.close();

	}

}
