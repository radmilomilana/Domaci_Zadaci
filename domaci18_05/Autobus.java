package domaci18_05;

import java.util.ArrayList;


public class Autobus {
	private String naziv;
	private double cenaKarte;
	private Vozac vozacAutobusa;
    private ArrayList<Putnik> listaPutnika;
    
	public Autobus(String nazivAutobusa, double cenaKarte) {
		super();
		this.naziv = nazivAutobusa;
		this.cenaKarte = cenaKarte;
		this.listaPutnika = new ArrayList<Putnik>();
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCenaKarte() {
		return cenaKarte;
	}
	public void setCenaKarte(double cenaKarte) {
		this.cenaKarte = cenaKarte;
	}
	public Vozac getVozacAutobusa() {
		return vozacAutobusa;
	}
	public void setVozac(Vozac vozacAutobusa) {
		this.vozacAutobusa = vozacAutobusa;
	}
	public void dodajPutnike (Putnik putnik) {
		listaPutnika.add(putnik);
	}
	
	public void ukloniPutnika (Putnik putnik) {
		listaPutnika.remove(putnik);
	}
	
	public void stampaBus () {
		System.out.println("Dobro dosli u autobus autoprevoznika: " + this.naziv + "!");
		System.out.println("Cena karte iznosi: " + this.cenaKarte + " dinara.");
	}
	
	public void stampaListaPutnika () {
		System.out.println("Lista putnika je: ");
		for (int i = 0; i < this.listaPutnika.size(); i++) {
			System.out.println(listaPutnika.get(i).getIme() + " " + listaPutnika.get(i).getPrezime() + " i ima novca " + listaPutnika.get(i).getNovac() + " dinara");
			
		}
	}
	
	public void stampajVozaca () {
		System.out.println("Vozac autobusa je: " + vozacAutobusa.getIme() + " " + vozacAutobusa.getPrezime());
	}
}




//Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. Naziv i cena
//karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca	


