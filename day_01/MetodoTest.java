package day_01;

public class MetodoTest {

	public static void main(String[] args) {
		
		stampa();
		stampaVariabile(11);
		System.out.println("somma x+y "+somma(10,11));

	}
	public static void stampa() {
		System.out.println("Hello World");
	}
	public static void stampaVariabile(int argomento) {
		System.out.println("Il valore della variabile: "+argomento);
	}
	public static int somma(int arg1,int arg2) {
		int z = 0; //variabile locale all'interno del metodo
		return arg1+arg2+z;
	}
}
