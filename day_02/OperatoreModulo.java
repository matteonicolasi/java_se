package day_02;

import java.util.Scanner;

public class OperatoreModulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numbers = new int [2];
				for(int i = 0; i<2;i++) {
					System.out.println("Inserisci un numero integer:");
					numbers [i] = input.nextInt();
				}
		int remainder = numbers [0] % numbers [1];
		System.out.println("La risultante del resto è: "+remainder);
					
		input.close();
	}

}
