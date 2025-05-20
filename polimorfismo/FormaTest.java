package polimorfismo;

public class FormaTest {

	public static void main(String[] args) {
		Quadrato quadrato = new Quadrato(10.0);
		Cerchio cerchio = new Cerchio(10.0);
		
		System.out.println("Area cerchio:" +cerchio.area());
		System.out.println("Area quadrato:" +quadrato.area());

		
		Forma q = new Quadrato(10.0);
		Forma c = new Cerchio(11.0);
		
		System.out.println("Area cerchio:" +c.area());
		System.out.println("Area quadrato:" +q.area());
		
		FormaController.area(c);
		FormaController.area(q);

	}

}
