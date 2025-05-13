package day_02;

import javax.swing.JOptionPane;

public class TrapezioArea {

//	    Calcolo dell'area di un trapezio

//		Implementa un programma che chieda all'utente di inserire la lunghezza delle basi e 
//		l'altezza di un trapezio e calcoli la sua area utilizzando le formule geometriche.
	public static void main(String[] args) {
		
		String b1= JOptionPane.showInputDialog("Base 1: ");
		String b2= JOptionPane.showInputDialog("Base 2: ");

		String h = JOptionPane.showInputDialog("Altezza: ");
		
		double area = (Double.parseDouble(b1)+Double.parseDouble(b2)*Double.parseDouble(h)/2);
		
		System.out.println("L'area del trapezio è: "+area);
	}

}
