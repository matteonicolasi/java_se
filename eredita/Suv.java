package eredita;

public class Suv extends Macchina {

	private boolean trazione;
	private double altezza;
	private boolean portapacchi;
	private String modalitaGuida;

	public Suv() {
		super();
		// costruttore di default
	}

	// costruttore parametrico
	public Suv(String brand, String modello, int anno, double peso, String consumo, boolean isAutomatic, int posti,
			int numeroPorte, int bagagliaio, boolean trazione, double altezza, boolean portapacchi,
			String modalitaGuida) {
		super(brand, modello, anno, peso, consumo, isAutomatic, posti, numeroPorte, bagagliaio);
		this.trazione = trazione;
		this.altezza = altezza;
		this.portapacchi = portapacchi;
		this.modalitaGuida = modalitaGuida;
	}

	@Override
	public String toString() {
		return "Suv [" + super.toString() + " trazione = " + trazione + ", altezza=" + altezza + ", portapacchi="
				+ portapacchi + ", modalitaGuida=" + modalitaGuida + "]";
	}

	public boolean isTrazione() {
		return trazione;
	}

	public void setTrazione(boolean trazione) {
		this.trazione = trazione;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public boolean isPortapacchi() {
		return portapacchi;
	}

	public void setPortapacchi(boolean portapacchi) {
		this.portapacchi = portapacchi;
	}

	public String getModalitaGuida() {
		return modalitaGuida;
	}

	public void setModalitaGuida(String modalitaGuida) {
		this.modalitaGuida = modalitaGuida;
	}

}
