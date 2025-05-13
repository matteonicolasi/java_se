package day_02;

import java.util.Scanner;

public class FrasiPalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase :");
		String frase = input.nextLine();
		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");

		for (int i = 0, j = frase.length() - 1; i < frase.length() / 2; i++, j--) {

			if (!(frase.charAt(i) == frase.charAt(j))) {
				System.out.println("La frase non è palindroma.");
				return;
			}
		}
		System.out.println("La frase è palindroma.");

		input.close();
	}

}
