package domaci_11_05;

public class RacunGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Racun racun1 = new Racun();
		racun1.setStanje(5879.69);
		racun1.getbrRacuna();
		
		System.out.println("Pocetno stanje racuna " + racun1.getbrRacuna() + " je " + racun1.getStanje() + " dinara.");
		
		racun1.DodavanjeNovca(653.5);
		System.out.println("Korisniku racuna " + racun1.getbrRacuna() + " uplacena je suma novca te je trenutno stanje racuna " + racun1.getStanje() + " dinara.");
		racun1.skidanjeNovca(599.65);
		System.out.println("Korisniku racuna " + racun1.getbrRacuna() + " skinuta je suma novca te je trenutno stanje racuna " + racun1.getStanje() + " dinara.");
	}

}
