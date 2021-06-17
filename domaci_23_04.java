package domaci;

import java.util.Scanner;

public class domaci_23_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//napisi program koji na osnovu broja godina osobe vraca da li se prijava za polaganje prihvata
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Unesi ime korisnika: ");
		String ime = s.next();
		System.out.println("Unesi prezime korisnika: ");
		String prezime = s.next(); 
		System.out.println("Unesi godinu rodjenja korisnika: ");
		int godinaRodjenja = s.nextInt();
		
		System.out.println("Ime korisnika: " + ime);
		System.out.println("Prezime korisnika: " + prezime);
		System.out.println("Godina rodjenja: " + (2021 - godinaRodjenja) );
		
		System.out.println("Unesi broj godina:");
		int brojgodina = s.nextInt();
		
		if((brojgodina > 17) && (brojgodina < 66)) {
			System.out.println("Vasa prijava je prihvacena.");
		}else if ((brojgodina < 18) && (brojgodina > 0)) {
			System.out.println("Samo osobe starije od 18 godina mogu imati vozacku dozvolu.");
		}else if (brojgodina > 65) {
			System.out.println("Samo osobe do 65 godina mogu imati vozacku dozvolu.");
		}else if (brojgodina <= 0 ){
			System.out.println("Nepravilan unos! Broj godina mora biti pozitivan broj i veci od nule. ");
		}
	s.close();
	}

}
