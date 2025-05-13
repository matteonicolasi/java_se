package day_02;

import java.util.Scanner;

public class ContaggioParole {

//	public static void main(String[] args) {
//		 Scanner scanner = new Scanner(System.in);
//	        
//	        System.out.print("Inserisci una stringa: ");
//	        String frase = scanner.nextLine();
//
//	        scanner.close();
//	        
//	        String[] parole = frase.split("\\s+");
//	        
//	        System.out.println("Numero di parole: " + parole.length);
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Inserisci una frase :");
		String frase = input.nextLine();

		char carattere = ' ';
		boolean interruttore = true;
		int count = 0;
for(int i = 0; i < frase.length(); i++) {//per tutta la lunghezza della frase
			carattere = frase.charAt(i);
			if(Character.isAlphabetic(carattere) && interruttore) {
				count++;
				interruttore = false;
			} else {
				if(!Character.isAlphabetic(carattere)) {
					interruttore = true;
				}
			}
		}
		
//		String[] word = frase.split(" ");
//		System.out.println("Numero parole : " + word.length);
		System.out.println("Word number : " + count);
	}


	}


