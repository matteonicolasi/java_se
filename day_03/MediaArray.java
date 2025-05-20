package day_03;

import java.lang.reflect.Array;

public class MediaArray {

	public static void main(String[] args) {
		// Scrivi un programma Java che calcola la media dei valori 
		//presenti in un array 
		// di numeri in virgola mobile (double).
		double [] numeri = {3.0,6.0,2.0,4.0,5.0};
		double somma = 0;
		for(int i =0;i<Array.getLength(numeri);i++) {
			somma = somma + numeri[i];
		}
		
		double media = somma /numeri.length;
		
		System.out.println("La media dei numeri dell'Array è :"+media);
	}

}
