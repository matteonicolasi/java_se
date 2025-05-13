package day_02;

import java.util.Scanner;

public class OccorrenzaLetteraSpecifica {

	public static void main(String[] args) {
		
//		Scrivi un programma Java che calcola il 
//		numero di occorrenze di una lettera specificata all'interno di una stringa data.

		Scanner input = new Scanner(System.in);	
		System.out.println("Inserisci una frase :");
		String frase = input.nextLine();
		System.out.println("Inserisci una lettera da ricerca nella frase :");
		char lettera = input.nextLine().charAt(0);
		int count = 0;
		for (int i= 0;i<frase.length();i++) {
			if(frase.charAt(i)==lettera) {
				count ++;
			}
		
		}
		System.out.println("Numero delle lettere " +lettera + " uguale a " + count);
		input.close();
	}
	

}
