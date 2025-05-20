package polimorfismo;

public class Quadrato extends Forma {

	public Quadrato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quadrato(double raggioLato) {
		super(raggioLato);
		// TODO Auto-generated constructor stub
	}

	public double perimetroCirconferenza() {

		return getRaggioLato() * 4;
	}

	public double area() {

		return Math.pow(getRaggioLato(), 2);
	}

}
