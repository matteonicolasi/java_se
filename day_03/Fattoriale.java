package day_03;

import java.util.Scanner;

public class Fattoriale {
    public static void main(String[] args) {
     
    	//Scrivi un programma Java che calcola il fattoriale di un numero 
    	//dato.es. 9! = 9*8*7*6*5*4*3*2*1PAGINA 20
    	
        Scanner input = new Scanner(System.in);
  
        System.out.print("Inserisci un numero: ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Il numero deve essere positivo.");
        } else {
            
            int fattoriale = 1;
            for (int i = 1; i <= n; i++) {
                fattoriale *= i;
            }
           
            System.out.println("Il fattoriale di " + n + " è: " + fattoriale);
        }
        
        input.close();
    }
}
