package eredita;

public class MacchinaTest {

	public static void main(String[] args) {
		
		//String brand, String modello, int anno, double peso, String consumo, boolean isAutomatic,
		//int posti, int numeroPorte, int bagagliaio
		
//		String brand, String modello, int anno, double peso, String consumo, boolean isAutomatic, int posti,
//		int numeroPorte, int bagagliaio, boolean trazione,double altezza, boolean portapacchi,String modalitaGuida
//		
		Macchina panda = new Macchina("Fiat","Panda", 1992, 980, "benzina", false, 3, 2, 35);
		//System.out.println(panda.toString());
		Suv sandero = new Suv ("Dacia", "Sandero", 2022, 1500, "gasolio", false, 4, 5, 300, false, 35, true, "City");
		//System.out.println(sandero.toString());
		
		Veicolo[] veicoli = {panda,sandero};
		
		for (int i = 0;i<veicoli.length;i++) {
			System.out.println(veicoli[i].toString());
		}
//		
//	Codice da non scrivere
//	MacchinaController controller = new MacchinaController();
//controller.aggiornaBenzina(0, alfa);
		
	}

}
