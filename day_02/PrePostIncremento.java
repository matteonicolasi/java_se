package day_02;

public class PrePostIncremento {

	public static void main(String[] args) {
		//x++ post incremento(bisogna guardare la posizione dei ++ rispetto alla variabile x)
		int x = 5;
		System.out.println("Valore della variabile x : " + x++);
		System.out.println("Valore della variabile x dopo il post incremento: " + x);
		
		//++x pre incremento(bisogna guardare la posizione dei ++ rispetto alla variabile x)
int y = 5;
		System.out.println("Valore della variabile y : " + ++y);
		System.out.println("Valore della variabile y dopo il pre incremento: " + y);
		
		
		for(int j = 0; j < 4; ++j) {//pre-incremento
			System.out.println("Valore della variabile j : " + j);
		}

	}

}