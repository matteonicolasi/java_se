package interfaccia_;

public class Persona implements AltezzaInterface {

	public double altezza;

	@Override
	public double altezza() {

		return this.altezza;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(double altezza) {
		super();
		this.altezza = altezza;
	}

}
