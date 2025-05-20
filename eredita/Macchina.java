package eredita;

//Classe figlia di Veicolo o classe derivata

public class Macchina extends Veicolo {

	private int numeroPorte;
	private double bagagliaio;
	
	
	public Macchina() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Macchina(String brand, String modello, int anno, double peso, String consumo, boolean isAutomatic,
			int posti, int numeroPorte, int bagagliaio) {
		super(brand, modello, anno, peso, consumo, isAutomatic, posti);
		this.numeroPorte = numeroPorte;
		this.bagagliaio = bagagliaio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() +  " numeroPorte = "+numeroPorte + " bagagliaio=" + bagagliaio;
	}
	
	
	
}