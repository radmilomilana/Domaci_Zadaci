package domaci_29_04;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Napisati program gde korisnik unese ime, prezime i pol (preko void metode)
		//a main metoda stampa i vraca "Dobrodosao u IT" ili "Dobrodosla u IT" zavisno koji pol unese
		
		Scanner s = new Scanner (System.in);
		System.out.println("Unesite ime: ");
		String ime = s.next();
		System.out.println("Unesite prezime: ");
		String prezime = s.next();
		System.out.println("Unesite pol(muski/zenski): ");
		String pol = s.next();

	if ( pol.equals("muski")) { 
			System.out.println(ime + " " + prezime + ", dobro dosao u IT!");
			}
		else if (pol.equals("zenski")) { 
			System.out.println(ime + " " + prezime + ", dobro dosla u IT!");
			}
		s.close();
	}

}
