package domaci_11_05;

public class Racun {

	private String brRacuna = "878-987";
	public double stanje;

	public Racun(String brojRacuna, double stanjeNaRacunu) {
		this.brRacuna = brojRacuna;
		this.stanje = stanjeNaRacunu;

	}

	public Racun() {
	}

	public void stampanjePodatakaOracunu() {
		System.out.println("Korisnik racuna " + this.brRacuna + " na stanju ima " + this.stanje);

	}

	public String getbrRacuna() {
		return this.brRacuna;
	}

	public void setStanje(double stanjeNaRacunu) {
		this.stanje = stanjeNaRacunu;
	}

	public double getStanje() {
		return this.stanje;
	}

	public void DodavanjeNovca(double dodatiIznos) {
		this.stanje += dodatiIznos;
		}


	public void skidanjeNovca(double skinutiIznos) {
		this.stanje -= skinutiIznos;
		}

}
