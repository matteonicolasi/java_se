package day_02;

import java.util.Scanner;

public class ExcerciseQuattro {

	public static void main(String[] args) {
//		Calcolo dell'area di un cerchio
//		Traccia: Scrivi un programma Java che chieda all'utente di inserire il raggio
//		di un cerchio e stampi l'area corrispondente. Utilizza il valore costante di π
//		come 3.14159.

		    Scanner scanner = new Scanner(System.in);

	        System.out.print("Inserisci il raggio del cerchio: ");
	        double raggio = scanner.nextDouble();

	        double area = Math.PI * Math.pow(raggio, 2);

	        System.out.println("L'area del cerchio con raggio " + raggio + " è: " + area);

	        scanner.close();
	}

}
