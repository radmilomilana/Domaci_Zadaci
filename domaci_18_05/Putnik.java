package domaci_18_05;

public class Putnik extends Covek{
	private int novac;
	public Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		this.novac = novac;
	}
	public int getNovac() {
		return novac;
	}
	public void setNovac(int novac) {
		this.novac = novac;
	}
	public void dodatNovac (int novac) {
		this.novac = this.novac + novac;
	}
	public void oduzetiNovac (int novac) {
		this.novac = this.novac - novac;
	}
	
	public void stampaj() {
		System.out.println(super.getIme() + " " + super.getPrezime() + " koji/ja ima: " + this.novac + " dinara.");
	
	
}
}

