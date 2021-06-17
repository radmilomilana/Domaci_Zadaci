package domaci_28_04;

import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program gde korisnik unese datum rodjenja i program vrati koji je to
		// horoskopski znak

		Scanner s1 = new Scanner(System.in);
		System.out.println("Unesite dan : ");
		int datum = s1.nextInt();

		System.out.println(" i mesec: ");
		int mesec = s1.nextInt();

		if ((datum >= 21 && datum <= 31 && mesec == 3) || (datum >= 1 && datum <= 20 && mesec == 4)) {
			System.out.println("Horoskopski znak je: ovan.");
		}
		if ((datum >= 21 && datum <= 30 && mesec == 4) || (datum >= 1 && datum <= 20 && mesec == 5)) {
			System.out.println("Horoskopski znak je: bik");
		}
		if ((datum >= 21 && datum <= 31 && mesec == 5) || (datum >= 1 && datum <= 20 && mesec == 6)) {
			System.out.println("Horoskopski znak je: blizanci.");
		}
		if ((datum >= 21 && datum <= 30 && mesec == 6) || (datum >= 1 && datum <= 20 && mesec == 7)) {
			System.out.println("Horoskopski znak je: rak.");
		}
		if ((datum >= 21 && datum <= 31 && mesec == 7) || (datum >= 1 && datum <= 20 && mesec == 8)) {
			System.out.println("Horoskopski znak je: lav.");
		}
		if ((datum >= 21 && datum <= 31 && mesec == 8) || (datum >= 1 && datum <= 22 && mesec == 9)) {
			System.out.println("Horoskopski znak je: devica.");
		}
		if ((datum >= 23 && datum <= 30 && mesec == 9) || (datum >= 1 && datum <= 20 && mesec == 10)) {
			System.out.println("Horoskopski znak je: vaga.");
		}
		if ((datum >= 21 && datum <= 31 && mesec == 10) || (datum >= 1 && datum <= 22 && mesec == 11)) {
			System.out.println("Horoskopski znak je: skorpija.");
		}
		if ((datum >= 23 && datum <= 30 && mesec == 11) || (datum >= 1 && datum <= 20 && mesec == 12)) {
			System.out.println("Horoskopski znak je: strelac.");
		}
		if ((datum >= 21 && datum <= 31 && mesec == 12) || (datum >= 1 && datum <= 19 && mesec == 1)) {
			System.out.println("Horoskopski znak je: jarac.");
		}
		if ((datum >= 20 && datum <= 31 && mesec == 1) || (datum >= 1 && datum <= 18 && mesec == 2)) {
			System.out.println("Horoskopski znak je: vodolija.");
		}
		if ((datum >= 19 && datum <= 29 && mesec == 2) || (datum >= 1 && datum <= 20 && mesec == 3)) {
			System.out.println("Horoskopski znak je: riba.");
		} else if (datum > 29 && datum <= 31 && mesec == 2) {
			System.out.println("Nepravilan unos, februar ima najviše 29 dana.");
		} else {
			System.out.println("Nepravilan unos. Meseci su izmedju 1 i 12, a dani izmedju 1 i 31.");
		}
		s1.close();
	}
}