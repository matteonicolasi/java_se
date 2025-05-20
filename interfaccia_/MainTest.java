package interfaccia_;

public class MainTest {

	public static void main(String[] args) {
		
		Edificio edi = new Edificio(30.0);
		Persona per = new Persona(1.50);

		AltezzaInterface edi1 = new Edificio(30.0);
		AltezzaInterface per1 = new Persona(1.85);
		
		AltezzaInterface[] arrInter = {edi1,per1};
	}



}
