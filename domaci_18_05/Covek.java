package domaci_18_05;

public class Covek {

	private String ime;
	private String prezime;
	
	
	public Covek(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}


	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}
	
	
	public void stampaj () {
		System.out.println(this.ime + " " + this.prezime); //sve sto je vezano za ovu klasu navodi se sa this
	}
	
}
//Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
//Svi podaci mogu da se dohvate, ali ne i postave.
