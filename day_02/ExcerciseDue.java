package day_02;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExcerciseDue {

	public static void main(String[] args) {
		
//		Calcolo dell'area di un rettangolo
//		Traccia: Scrivi un programma Java che chieda all'utente di inserire la
//		lunghezza e la larghezza di un rettangolo e stampi l'area corrispondente.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci base del rettangolo: ");
        BigDecimal base = input.nextBigDecimal();
        System.out.println("Inserisci altezza del rettangolo : ");
        BigDecimal altezza = input.nextBigDecimal();
		
        BigDecimal area = base.multiply(altezza); 
        System.out.println("Area del rettangolo: "+area);
		input.close();

	}

}
