package domaci_17_05;

import java.util.ArrayList;

public class Klub extends Sportista {

	private String nazivKluba;
	private String sediste;
	private int godOsnivanja;
	private ArrayList<Sportista> sportisti = new ArrayList<Sportista>();
	
	public Klub(String nazivKluba, String sediste, int godOsnivanja) {
		super();
		this.nazivKluba = nazivKluba;
		this.sediste = sediste;
		this.godOsnivanja = godOsnivanja;
	}
	
	public Klub () {}
	
	
	public String getNazivKluba() {
		return nazivKluba;
	}
	public void setNazivKluba(String nazivKluba) {
		this.nazivKluba = nazivKluba;
	}
	public String getSediste() {
		return sediste;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	public ArrayList<Sportista> getSportisti() {

		return sportisti;

	}

	public void dodavanjeSportiste(Sportista sportista) {

		this.sportisti.add(sportista);

	}

	public void izbacivanjeSortiste(Sportista sportista) {

		this.sportisti.remove(sportista);

	}
	
	public void stampajPodatkeOKlubu () {
		
		System.out.print("Naziv kluba: " + this.nazivKluba + ", sediste je: " +
				this.sediste + ". Klub je osnovan " + this.godOsnivanja + ". U njemu igra ") ;
		
	}
	
}


/*Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. Sva polja mogu da se
dohvate, a naziv kluba moze i da se postavi.*/
