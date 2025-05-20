package polimorfismo;

public abstract class Forma {

	private double raggioLato;

	public double getRaggioLato() {
		return raggioLato;
	}

	public void setRaggioLato(double raggioLato) {
		this.raggioLato = raggioLato;
	}

	public Forma(double raggioLato) {
		super();
		this.raggioLato = raggioLato;
	}

	public Forma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public abstract double perimetroCirconferenza();

	public abstract double area();

	@Override
	public String toString() {
		return "Forma [raggioLato=" + raggioLato + "]";
	}

}
