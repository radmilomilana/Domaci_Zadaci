package domaci;

import java.util.Scanner;

public class domaci_26_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj dana u mesecu: ");
		int brojDanaUmesecu = s.nextInt();

		if (brojDanaUmesecu == 1) {
			System.out.println("Svi meseci imaju jedan dan u godini.");
		} else if (brojDanaUmesecu == 29 && brojDanaUmesecu == 30) {
			System.out.println("Svi meseci, osim februara, imaju " + brojDanaUmesecu + " dana u godini.");
		} else if (brojDanaUmesecu == 29) {
			System.out.println("Kada je prestupna godina, februar ima " + brojDanaUmesecu + " dana u godini.");
		} else if (brojDanaUmesecu >= 1 && brojDanaUmesecu <= 28) {
			System.out.println("Svi meseci imaju " + brojDanaUmesecu + " dana.");
		} else if (brojDanaUmesecu == 31) {
			System.out.println("7 meseci (januar, mart, maj, jul, avgust, oktobar, decembar) ima " + brojDanaUmesecu
					+ " dan u godini.");
		} else {
			System.out.println("Van opsega.");
		}
		s.close();

	}
}
