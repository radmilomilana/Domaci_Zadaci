package domaci_18_05;

public class Autobus1 {

	private String naziv;
	private Vozac sofer;
	private double cenaKarte;
	private Putnik putnik;
	
	
	public Autobus1(String naziv, Vozac sofer, double cenaKarte, Putnik putnik) {
		super();
		this.naziv = naziv;
		this.sofer = sofer;
		this.cenaKarte = cenaKarte;
		this.putnik = putnik;
	}
	
	public Vozac getSofer() {
		return sofer;
	}
	public void setSofer(Vozac sofer) {
		this.sofer = sofer;
	}
	public Putnik getPutnik() {
		return putnik;
	}
	public void setPutnik(Putnik putnik) {
		this.putnik = putnik;
	}
	public String getNaziv() {
		return naziv;
	}
	public double getCenaKarte() {
		return cenaKarte;
	}
	
	
	
	
	public void stampaj() {
		System.out.println("Autobus prevoznika " + this.naziv + " vozi vozac " + this.sofer.getIme()+  " " + this.sofer.getPrezime() + 
				" koji je po zanimanju " +this.sofer.getZanimanje() +" , a cena karte je " + this.cenaKarte + " dinara. " + 
				" U autobusu putuje i putnik " + this.putnik.getIme() + " "+ this.putnik.getPrezime());
	}
	
}
