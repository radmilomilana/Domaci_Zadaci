package domaci_07_05;

import java.util.Scanner;

public class domaci_zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite prvi broj: ");
		int num1 = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int num2 = s.nextInt();
		System.out.print("Unesite treci broj: ");
		int num3 = s.nextInt();
		s.close();
		if (num1 + num2 == num3) {
			System.out.println("Zbir prva dva broja jednak je trecem.");
		} else {
			System.out.println("Zbir prva dva broja nije jednak trecem.");
		}
	}

	public static boolean sum(int num1, int num2, int num3) {
		boolean vrednost = true;

		if (num1 + num2 != num3) {
			vrednost = false;
		}
		return vrednost;
	}
}

//Napisati funkciju koja za parametre prima tri broja num1, num2 i num3 i proverava da li je zbir num1 i num2 jednak num3.
//Primer:
//Ako se unese num1 = 2, num2 = 4, i num3 = 99 vraca false
//Ako se unese num1 = 2, num2 = 4, i num3 = 6 vraca true
