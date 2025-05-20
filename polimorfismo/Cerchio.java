package polimorfismo;

public class Cerchio extends Forma {

	public Cerchio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cerchio(double raggioLato) {
		super(raggioLato);
		// TODO Auto-generated constructor stub
	}

	public double perimetroCirconferenza() {

		return Math.PI * getRaggioLato();
	}

	public double area() {

		return Math.pow(getRaggioLato(), 2) * Math.PI;
	}
}
