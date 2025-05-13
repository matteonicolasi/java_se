package day_02;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExerciseUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        BigDecimal x = input.nextBigDecimal();
        System.out.println("Inserisci il secondo numero : ");
        BigDecimal y = input.nextBigDecimal();

        BigDecimal somma = x.add(y);
        System.out.println("Sum numbers = " + somma);
		input.close();
		
		
	}

}
