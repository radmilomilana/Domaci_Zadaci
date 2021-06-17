package domaci_18_05;

public class Vozac extends Covek {

	private String zanimanje;

	public Vozac(String ime, String prezime, String zanimanje) {
		super(ime, prezime);
		this.zanimanje = zanimanje;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}

	public void stampajVozac() {
		System.out.println("Covek " + super.getIme() + " " + super.getPrezime() + " po zanimaju je " + this.zanimanje);
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	
	
}
//Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
