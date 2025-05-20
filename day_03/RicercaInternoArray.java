package day_03;

import java.lang.reflect.Array;

public class RicercaInternoArray {

	public static void main(String[] args) {
		// Scrivi un programma Java che ricerca un elemento specifico all'interno 
		// di un array 
		// di interi e restituisce la sua posizione (indice).
		int [] numeri = {3,8,5,24,67,12};
		int elemento = 67;
		int posizione = 0;
		
		for(int i = 0;i<Array.getLength(numeri);i++) {
			if(elemento==numeri[i]) {
				System.out.println("Elemento " + elemento + "trovato in alla posizione[" + i + "]");
				return;
			}
		}
		
		System.out.println("Elemento non trovato");
	}

}
