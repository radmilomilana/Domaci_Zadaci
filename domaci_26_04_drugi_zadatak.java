package domaci;

import java.util.Scanner;

public class domaci_26_04_drugi_zadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji od korisnika trazi da unese dan u celoj godini a da za
		 * rezultat dobije kojoj nedelja pripada taj dan u godini. Primer. korisnik
		 * unese 75 a program kao rezultat vrati "11. nedelja u godini" Napomena:
		 * Racunajte da je prvi dan u godini ponedeljak.
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite dan u godini brojem: ");
		int brojDanaUGodini = s.nextInt();

		int b = (brojDanaUGodini / 7) + 1;

		if ((brojDanaUGodini > 0) && (brojDanaUGodini <= 366))
			System.out.println(b + ". nedelja u godini.");
		else {
			System.out.println("Uneli ste negativan broj, nulu ili broj veci od 366");
		}
		s.close();

	}

}
