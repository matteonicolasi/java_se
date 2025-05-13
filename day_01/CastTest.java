package day_01;

public class CastTest {

	public static void main(String[] args) {
		//Cast implicito di Java
		byte variabileByte = 127; //8 bit in complemento a due
		short variabileShort = variabileByte; //16 bit
		int variabileInt = variabileShort; // 32 bit 
		long variabileLong = variabileInt; // 64 bit
		float variabileFloat = variabileLong; // 64 bit
		double variabileDouble = variabileFloat; // 64 bit
		
		System.out.println("Valore della variabile double:"+variabileDouble);
		
		variabileFloat = (float)variabileDouble; //cast esplicito responsabilità del programmatore
		variabileLong = (long)variabileFloat; 
		variabileInt = (int)variabileLong;
		variabileShort = (short)variabileInt;
		variabileByte = (byte)variabileShort;
		
		int x = 4;
		int y = 3;
		//esempio di utilizzo cast esplicito
		double quoziente = x/(double)y;
		
		System.out.println("Risultato del quoziente: "+quoziente);
		
	}
	

}
