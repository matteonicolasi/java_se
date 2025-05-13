package day_02;

import javax.swing.JOptionPane;

public class IncorniciaIlNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = JOptionPane.showInputDialog("Inserisci il nome:");
		String base = "+";
		for (int i = 0; i < nome.length() + 2; i++) {
			base += "-";
		}
		base += "+\n";
		//System.out.println(base);
		String frame = "";
		frame += base + "| " + nome + " |\n";
		frame += base;
		System.out.println(frame);
	}

}
