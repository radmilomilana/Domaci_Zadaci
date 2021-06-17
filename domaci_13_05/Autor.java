package domaci_13_05;


public class Autor {
	
	
	private String ime;
	private String prezime;
	
	public Autor (String imeAutora, String prezimeAutora) {
	this.ime=imeAutora;
	this.prezime=prezimeAutora;
	}
	
	public Autor () {
		
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void stampanjePodatakaOautoru () {
		System.out.println("(" + this.ime + ") (" + this.prezime + ")" );
	}
	
	
}

/*Kreirati klasu Autor koja ima
-ime i prezime
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu:
(ime autora) (prezime autora)*/
