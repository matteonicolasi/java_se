package Macchina;

//Classe figlia di Veicolo o classe derivata

public class Macchina {

		// Progettare e realizzare una classe Car(automobile) con le proprietà seguenti.
		//Un’automobile ha una determinata resa del carburante (misurata in miglia/galloni o in litri/chilometri: scegliete il sistema che preferite) e una certa quantità di carburante nel serbatoio. 
		//La resa è specificata dal costruttore e il livello iniziale del carburante è a zero.

		//variaibili che se non inizializzate assumerebbero il valore di default.
		
		//variabili
		private double benzina;
		private double consumoMedio;
		
		//costruttore di default
		public Macchina() {
			super(); 
			//Se non lo specifichiamo esplicitamente verrebbe aggiunto dal compilatore di default
	
		}
		
	//costruttore parametrico dove le variabili vengono inizializzate esplicitamente
	public Macchina(double benzina,double consumoMedio) {
		super();
		this.benzina = benzina;
		this.consumoMedio = consumoMedio;
	}
	
	public double getBenzina() {
		return this.benzina;
	}
	
	public void setBenzina(double benzina) {
		this.benzina = benzina;
	}
	
	public double getConsumoMedio() {
		return this.consumoMedio;
	}
	
	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}
	
	public String toString() {
		return "Benzina : " + this.benzina + "Consumo Medio: " + this.consumoMedio;
	}

}