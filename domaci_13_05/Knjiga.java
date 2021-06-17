package domaci_13_05;

//import java.io.LineNumberInputStream;
//import java.util.ArrayList;

public class Knjiga {
	
	private String ISBN;
	private String naziv;
	private int godinaIzdanja;
	private String autor;
	//private ArrayList<Autor> spisakAutora;
	
	public Knjiga (String ISBNknjige, String nazivKnjige, int godIzdanja, String Autor) {
		this.ISBN=ISBNknjige;
		this.naziv=nazivKnjige;
		this.godinaIzdanja=godIzdanja;
		this.autor=Autor;
				
	}
	
	public Knjiga () {}
	
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getISBN() {
		return ISBN;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getNaziv() {
		return naziv;
	}
	
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAutor() {
		return autor;
	}
	
	public void stampanjePodatakaOknjizi () {
		System.out.println("(" + this.ISBN + ") "
	+ "(" + this.naziv + ") - (" + this.godinaIzdanja + ")" );
	}
		
	public void stampanjeOAutoru ()  {
	System.out.println("autor: " + this.autor);
	}
		
		/*System.out.println();
		for (int i = 0; i < spisakAutora.size(); i++) {
			spisakAutora.get(i).stampanjePodatakaOautoru();
			System.out.println("autor je: (" + spisakAutora );
		}*/
	}
	
	


/*Kreirati klasu Knjiga koji ima:
-ISBN
-naziv
-godina izdanja
-autor
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu (izbegavati dupliranje koda):
(ISBN)
(naziv) - (godina izdanja)
autor: (ime autora) (prezime autora)*/