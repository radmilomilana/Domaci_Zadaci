package domaci_13_05;

public class AutorKnjiga_Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Autor autor1= new Autor("Gijom", "Muso");
		
		Knjiga knjiga1 = new Knjiga();
		knjiga1.setISBN("978-86-521-2015-4");
		knjiga1.setNaziv("Seobe");
		knjiga1.setGodinaIzdanja(2015);
		
		Knjiga knjiga2 = new Knjiga();
		knjiga2.setISBN("978-86-100-311-71");
		knjiga2.setNaziv("Dnevnik o Carnojevicu");
		knjiga2.setGodinaIzdanja(1920);
		
		Autor autor2 = new Autor();
		autor2.setIme("Milos");
		autor2.setPrezime("Crnjanski");
		
		knjiga1.stampanjePodatakaOknjizi();
		System.out.print("autor:");
		autor2.stampanjePodatakaOautoru();
		
		
		knjiga2.stampanjePodatakaOknjizi();
		System.out.print("autor:");
		autor2.stampanjePodatakaOautoru();
		
		//Knjiga knjiga3 = new Knjiga("978-86-100-337-31", "Zivot je roman", 2019, autor2);
		Knjiga knjiga3 =  new Knjiga();
		knjiga3.setISBN("978-86-100-337-31");
		knjiga3.setNaziv("Zivot je roman");
		knjiga3.setGodinaIzdanja(2019);
		
		knjiga3.stampanjePodatakaOknjizi();
		System.out.print("autor: ");
		autor1.stampanjePodatakaOautoru();
		
		Knjiga knjiga4 =  new Knjiga();
		knjiga4.setISBN("978-86-10-02799-0");
		knjiga4.setNaziv("Tajni zivot pisca");
		knjiga4.setGodinaIzdanja(2020);
		
		knjiga4.stampanjePodatakaOknjizi();
		System.out.print("autor: ");
		autor1.stampanjePodatakaOautoru();
		

		Knjiga knjiga5 =  new Knjiga();
		knjiga5.setISBN("978-86-10-01215-6");
		knjiga5.setNaziv("Central Park");
		knjiga5.setGodinaIzdanja(2014);
		
		knjiga5.stampanjePodatakaOknjizi();
		System.out.print("autor: ");
		autor1.stampanjePodatakaOautoru();
		
		Autor autor3 = new Autor();
		autor3.setIme("Fjodor Mihajlovic");
		autor3.setPrezime("Dostojevski");
		
		Knjiga knjiga6 =  new Knjiga();
		knjiga6.setISBN("978-86-521-3239-3");
		knjiga6.setNaziv("Zlocin i kazna");
		knjiga6.setGodinaIzdanja(2019);
		
		knjiga6.stampanjePodatakaOknjizi();
		System.out.print("autor: ");
		autor3.stampanjePodatakaOautoru();
		
		Knjiga knjiga7 =  new Knjiga();
		knjiga7.setISBN("978-86-521-3554-7");
		knjiga7.setNaziv("Zapisi iz podzemlja");
		knjiga7.setGodinaIzdanja(2019);
		
		knjiga7.stampanjePodatakaOknjizi();
		System.out.print("autor: ");
		autor3.stampanjePodatakaOautoru();
		
		Knjiga knjiga8 =  new Knjiga();
		knjiga8.setISBN("978-86-767-427-76");
		knjiga8.setNaziv("Kockar");
		knjiga8.setGodinaIzdanja(2018);
		
		knjiga8.stampanjePodatakaOknjizi();
		System.out.print("autor: ");
		autor3.stampanjePodatakaOautoru();
		
		Knjiga knjiga9 =  new Knjiga();
		knjiga9.setISBN("978-86-795-821-93");
		knjiga9.setNaziv("Neprijatan slucaj");
		knjiga9.setGodinaIzdanja(2018);
		
		knjiga9.stampanjePodatakaOknjizi();
		System.out.print("autor: ");
		autor3.stampanjePodatakaOautoru();
	}

}


//U glavnom programu napraviti vise autora sa vise knjiga.