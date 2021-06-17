package domaci_07_05;

import java.util.Scanner;

public class domaci_zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner brojDanauGodini = new Scanner(System.in);
		System.out.println("Unesite redni broj dana u godini: ");
		int dan = brojDanauGodini.nextInt();
		int danUNedelji = 1;
		brojDanauGodini.close();
		for (int i = dan; i >= -6; i -= 7) {

			if (dan < 1 || dan > 365) {
				System.out.println("Greska u unosi, unesite broj u rasponu od 1 do 365");
				break;
			}
			danUNedelji = i;
			switch (danUNedelji) {
			case -6: {
				System.out.println( dan + ". dan u godini je ponedeljak.");
			}
				break;
			case -5: {
				System.out.println(dan + ". dan u godini je utorak.");
			}
				break;
			case -4: {
				System.out.println( dan + ". dan u godinin je sreda.");
			}
				break;
			case -3: {
				System.out.println(dan + ". dan u godini je cetvrtak.");
			}
				break;
			case -2: {
				System.out.println(dan + ". dan u godini je petak.");
			}
				break;
			case -1: {
				System.out.println(dan + ". dan u godini je subota.");
			}
				break;
			case 0: {
				System.out.println(dan + ". dan u godini je nedelja.");
			}
				break;
			default:
				break;
			}

		}
	}
}

//Napisati program gde korisnik unese redni broj dana u godini (1-365) i program vrati odgovor
//koji je to dan u nedelji. Podjimo od pretpostavke da je 1. januar ponedeljak.
