package polimorfismo;

public class FormaController {

	//late binding o polimorfismo dinamico
	
	public static void area(Forma forma) {
		
		System.out.println("Valore area: " +forma.area() );
		
	}
	
public static void perimetro(Forma forma) {
		
		System.out.println("Valore perimetro: " +forma.perimetroCirconferenza() );
		
	}
	
}
