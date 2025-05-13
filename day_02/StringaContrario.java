package day_02;

import java.util.Scanner;

public class StringaContrario {

	public static void main(String[] args) {
//		Scrivi un programma Java che inverte una stringa data.
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase :");
		String frase = input.nextLine();
		String invertita = "";
		for(int i =frase.length()-1;i>= 0;i--) {
			
			invertita = invertita + frase.charAt(i);
			
		}
		System.out.println("La stringa invertita è: "+invertita);
		
		
		input.close();
	}

}
