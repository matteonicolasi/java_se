package day_02;

import java.util.Random;

public class ExcerciseTre {

	public static void main(String[] args) {
//		Gioco del lancio del dado
//		Traccia: Scrivi un programma Java che simuli il lancio di un dado a sei facce.
//		Il programma dovrà generare casualmente un numero compreso tra 1 e 6 e
//		stamparlo a schermo.
		
		       
		Random random = new Random();
		        
		        
	    int risultato = random.nextInt(6) + 1; 
		        
		
		System.out.println("Il risultato del lancio del dado è: " + risultato);
		    }

	}


