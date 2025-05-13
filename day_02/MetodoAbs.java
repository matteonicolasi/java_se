package day_02;

import javax.swing.JOptionPane;

public class MetodoAbs {
public static void main(String[] args) {
    // Chiediamo all'utente di inserire un numero
    String input = JOptionPane.showInputDialog("Enter an integer number");

    try {
        // Convertiamo l'input in un numero intero
        int numero = Integer.parseInt(input);

        // Calcoliamo e stampiamo il valore assoluto
        System.out.println("Valore assoluto: " + Math.abs(numero));
    } catch (NumberFormatException e) {
        // Gestiamo l'errore se l'utente inserisce un valore non numerico
        System.out.println("Errore: Devi inserire un numero intero valido.");
    }
}
}