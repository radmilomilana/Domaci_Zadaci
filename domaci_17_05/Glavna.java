package domaci_17_05;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportista sportista1 = new Sportista("Ivan", "Ivic", 1997);
		Sportista sportista2 = new Sportista("Vanja", "Milic", 1995);
		Sportista sportista3 = new Sportista("Stefan", "Lazic", 1993);
		
		Klub klub1 = new Klub("Metalac", "Gornji Milanovac", 1995);
		klub1.dodavanjeSportiste(sportista3);
		klub1.dodavanjeSportiste(sportista2);
		klub1.dodavanjeSportiste(sportista3);;
		klub1.dodavanjeSportiste(sportista1);
		for (int i = 0; i < klub1.getSportisti().size(); i++) {
			System.out.println(klub1.getSportisti().get(i).getPrezime());
		}
		
		System.out.println(sportista1.getPrezime());
		System.out.println(sportista1.getGodRodjenja());
		klub1.setNazivKluba("FK Milanovac");
		System.out.println(klub1.getNazivKluba());
		sportista1.stampajPodatkeOsportisti();
		
	}

}
/*Napisati glavni program, gde cete testirati kako ove klase funkcionisu.

Dodatak zadatku za vezbu: U Klubu napraviti niz sportista tipa Sportista umesto jednog sportiste.
Samim tim postojace metode koje ce dodavati i uklanjati sportistu.*/