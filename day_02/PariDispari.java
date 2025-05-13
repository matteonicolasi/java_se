package day_02;

import java.util.Scanner;

public class PariDispari {
	
//	Verifica se un numero è pari o dispari
//
//	Implementa un programma che chieda all'utente di inserire 
//	un numero intero e verifichi se è pari o dispari utilizzando l'operatore modulo.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean uscita = false;
		int numero = 0;
		do {
			System.out.println("Inserisci un numero integer: ");
			numero = input.nextInt();
			input.nextLine();
			if(numero >0) {
				System.out.println("" + ((numero % 2 ==0) ? "Numero Pari":"Numero Dispari"));
			}
			else {
				
				uscita = true;
		} 
		}while(!uscita);
		
		input.close();

	}

}
