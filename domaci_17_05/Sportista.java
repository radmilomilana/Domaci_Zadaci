package domaci_17_05;

public class Sportista {
	
	
	public String ime;
	public  String prezime;
	public int godRodjenja;
	
	public Sportista(String ime, String prezime, int godRodjenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godRodjenja = godRodjenja;
	}

	
	public Sportista() {
		super();
	}


	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}

	

	public int getGodRodjenja() {
		return godRodjenja;
	}




	public void stampajPodatkeOsportisti () {
		System.out.println(this.ime + "_" + this.prezime + ": " + this.godRodjenja);
	}

}
/*Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina rodjenja se
zadaju prilikom kreiranja i ne mogu da se promene. Sportistu ispisati u obliku:

IME_PREZIME: godinaRodjenja*/
