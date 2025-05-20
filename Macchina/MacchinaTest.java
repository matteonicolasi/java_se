package Macchina;

public class MacchinaTest {

	public static void main(String[] args) {
		Macchina panda = new Macchina(10,0.04);
		Macchina ferrari = new Macchina(100,1);
		Macchina alfa = new Macchina();
		System.out.println(panda.toString());
		System.out.println(ferrari.toString());
		System.out.println(alfa);
		alfa.setBenzina(100);
		alfa.setConsumoMedio(0.1);
		System.out.println("Serbatoio Panda:" +panda.getBenzina());
		MacchinaController.aggiornaBenzina(25, panda);
		MacchinaController.aggiornaBenzina(100, ferrari);
		MacchinaController.aggiornaBenzina(100, alfa);
		System.out.println(panda.toString());
		System.out.println(ferrari.toString());
		System.out.println(alfa.toString());
//		
//	Codice da non scrivere
//	MacchinaController controller = new MacchinaController();
//controller.aggiornaBenzina(0, alfa);
		
	}

}
