package day_03;

import java.util.Scanner;

public class PotenzaNumero {
		//Scrivi un programma Java che calcola la potenza di un numero
	    //Base elevato a unesponente dato.
	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Inserisci un numero :");
			double numero = input.nextDouble();
			System.out.println("Inserisci un espenente :");
			int exp = input.nextInt();
			                                                                    //lato chiamante: parametri attuali
			System.out.println("Il numero " + numero + " elevato alla " + exp + " = " + exponent(numero, exp));
	}
	//funzione ricorsiva
	public static double exponent(double num, int e) {//lato chiamato: parametri formali
		if(e == 1) {//passo base
			return num; 
		}
		return num * exponent(num, e-1);
	}
	
}
//exponent(6, 3) == > numero = 6, exp = 3 ==>  6 * exponent(6, 2) = 6 * 36 = 216
//exponent(6, 2) == > numero = 6, exp = 2 ==>  6 * exponent(6, 1) = 6 * 6 = 36
//exponent(6, 1) == > numero = 6