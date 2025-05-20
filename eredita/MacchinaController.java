package eredita;

public class MacchinaController {
	
	public static void aggiornaBenzina(double km, Macchina macchina) {
			
		double consumo = km * macchina.getConsumoMedio();
		
		macchina.setBenzina(macchina.getBenzina()-consumo);
		
	}
}
