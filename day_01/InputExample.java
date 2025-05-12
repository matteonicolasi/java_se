package day_01;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una parola: ");
		String parola = input.next();
		System.out.println("Hai inserito: "+parola);
		input.close();	
	}

}
