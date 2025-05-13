package day_02;

public class MaxMinValoreArray {

	public static void main(String[] args) {
		// Scrivi un programma Java che calcola il valore massimo
		//e il valore minimo presenti in un array di interi.
		int [] numeri = {20,15,10,30,22};
		int max = numeri[0];
		int min = numeri[0];
		for (int i=1;i<numeri.length;i++) {
			if(max<numeri[i]) {
				max = numeri[i];
			}
			if(min>numeri[i]) {
				min = numeri[i];
			}
		}
		System.out.println("Il valore massimo presente nell'Array è: "+max);
		System.out.println("Il valore minimo presente nell'Array è: "+min);
	}

}
