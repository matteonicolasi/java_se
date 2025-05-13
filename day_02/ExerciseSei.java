package day_02;

import java.util.Scanner;

public class ExerciseSei {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double somma = 0; // variabile locale
		int i = 0;
		for(;;) {
			System.out.println("Enter a number : ");
			somma = somma + input.nextDouble();
			++i;
			if(i >= 3) {
				break;
			}
		}
			
		double media = somma / 3;
		System.out.println("Average : " + media);
		input.close();
	}

}