package domaci18_05;

public class Putnik extends Covek {

	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public void setNovac(double novac) {
		this.novac = novac;
	}

	public void dodavanjeNovca(double dodajNovac) {
		this.novac += dodajNovac;
	}

	public void oduzimanjeNovca(double cenaKarte) {
		this.novac = this.novac - cenaKarte;

	}
}