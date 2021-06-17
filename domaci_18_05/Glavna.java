package domaci_18_05;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Covek covek1 = new Covek("Marko", "Savic");//ovaj ispis  je nepotreban jer nigde nije tražen
		//covek1.stampaj();//ovaj "covek" ce se naci unutar klase vozac ili putnik jer je oni nasledjuju,
		//System.out.println("----------------------------");
		Vozac vozac1 = new Vozac("Stefan", "Stevic", "vozac");
		vozac1.stampajVozac();
		System.out.println("----------------------------");
		Putnik putnik1 = new Putnik("Maja", "Vasic", 2500);
		putnik1.stampaj();
		System.out.println("----------------------------");
		Autobus1 autobus1 = new Autobus1("Lasta", vozac1, 1200, putnik1);
		autobus1.stampaj();
		System.out.println("----------------------------");
		
		ArrayList<Vozac> vozaci = new ArrayList<>();
		vozaci.add(vozac1);
		System.out.println("----------------------------");
		
		Putnik putnik2 = new Putnik("Sanja", "Savic", 950);
		Vozac vozac2 = new Vozac("Petar", "Peric" , "vozac");
		System.out.println("----------------------------");
		
		/*Autobus autobus2 = new Autobus("Lasta", 750);
		autobus2.dodajPutnika(putnik1);
		autobus2.dodajPutnika(putnik2);
		autobus2.dodajVozaca(vozac1);
		autobus2.stampajAutobus();
		System.out.println("----------------------------");
		Autobus bus1 = new Autobus("Severtrans", 750);
		bus1.dodajVozaca(vozac2);
		bus1.dodajPutnika(putnik2);
		bus1.stampajAutobus();*/
		


	}

}
