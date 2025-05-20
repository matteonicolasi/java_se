package eredita;

//Classe madre
public class Veicolo {

	private String brand;
	private String modello;
	private int anno;
	private double peso;
	private String consumo;
	private boolean isAutomatic;
	private int posti;

	public Veicolo(String brand, String modello, int anno, double peso, String consumo, boolean isAutomatic,
			int posti) {
		super();
		this.brand = brand;
		this.modello = modello;
		this.anno = anno;
		this.peso = peso;
		this.consumo = consumo;
		this.isAutomatic = isAutomatic;
		this.posti = posti;
	}

	public Veicolo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", modello=" + modello + ", anno=" + anno + ", peso=" + peso + ", consumo="
				+ consumo + ", isAutomatic=" + isAutomatic + ", posti=" + posti;
	}

}
