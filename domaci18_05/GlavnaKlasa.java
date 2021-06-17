package domaci18_05;

public class GlavnaKlasa {
	
public static void main(String[] args) {
		
		
		Putnik p1 = new Putnik("Bogdan", "Vasic", 1458);
		Putnik p2 = new Putnik("Milana", "Mikic", 1350);
		
		Vozac v1 = new Vozac("Vasilije", "Simic", "sofer autobusa");
		
		Autobus bus = new Autobus("Raketa", 350);
		
		bus.dodajPutnike(p1);
		bus.dodajPutnike(p2);
		bus.setVozac(v1);
		bus.stampaBus();
		System.out.println("________");
		bus.stampaListaPutnika();
		
		bus.stampajVozaca();
		
		p1.oduzimanjeNovca(350);
		p2.oduzimanjeNovca(350);
		System.out.println("_______");
		bus.stampaListaPutnika();
		

	}

}
